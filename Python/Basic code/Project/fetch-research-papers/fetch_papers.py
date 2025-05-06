import requests
import csv
import typer
from typing import Optional

# PubMed API Base URL
PUBMED_API_URL = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esearch.fcgi"

def fetch_papers(query: str, api_key: Optional[str] = None) -> list[dict]:
    """Fetch research papers from PubMed based on the query."""
    params = {
        "db": "pubmed",
        "term": query,
        "retmode": "json",
        "retmax": 100,  # Limit the number of results
    }
    if api_key:
        params["api_key"] = api_key

    response = requests.get(PUBMED_API_URL, params=params)
    response.raise_for_status()  # Raise error for HTTP issues
    data = response.json()
    
    paper_ids = data.get("esearchresult", {}).get("idlist", [])
    return paper_ids

def extract_relevant_data(paper_id: str) -> dict:
    """Fetch and extract relevant data for a single PubMed paper."""
    details_url = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esummary.fcgi"
    params = {
        "db": "pubmed",
        "id": paper_id,
        "retmode": "json",
    }
    response = requests.get(details_url, params=params)
    response.raise_for_status()
    data = response.json()

    # Extract data
    paper_info = data.get("result", {}).get(paper_id, {})
    title = paper_info.get("title", "N/A")
    pub_date = paper_info.get("pubdate", "N/A")
    authors = paper_info.get("authors", [])
    corresponding_email = paper_info.get("correspondence", {}).get("email", "N/A")

    # Identify non-academic authors and company affiliations
    non_academic_authors = [
        author["name"]
        for author in authors
        if "university" not in author.get("affiliation", "").lower()
    ]
    company_affiliations = [
        author["affiliation"]
        for author in authors
        if "pharmaceutical" in author.get("affiliation", "").lower()
        or "biotech" in author.get("affiliation", "").lower()
    ]

    return {
        "PubmedID": paper_id,
        "Title": title,
        "Publication Date": pub_date,
        "Non-academic Author(s)": "; ".join(non_academic_authors),
        "Company Affiliation(s)": "; ".join(company_affiliations),
        "Corresponding Author Email": corresponding_email,
    }

def save_to_csv(data: list[dict], filename: str):
    """Save the extracted data to a CSV file."""
    with open(filename, mode="w", newline="", encoding="utf-8") as file:
        writer = csv.DictWriter(
            file,
            fieldnames=[
                "PubmedID",
                "Title",
                "Publication Date",
                "Non-academic Author(s)",
                "Company Affiliation(s)",
                "Corresponding Author Email",
            ],
        )
        writer.writeheader()
        writer.writerows(data)

def main(
    query: str,
    filename: Optional[str] = typer.Option(
        None, "--file", "-f", help="Specify the filename to save the results."
    ),
    debug: bool = typer.Option(False, "--debug", "-d", help="Enable debug mode."),
):
    """Main entry point for the program."""
    try:
        if debug:
            typer.echo(f"Fetching papers with query: {query}")

        paper_ids = fetch_papers(query)
        if debug:
            typer.echo(f"Fetched {len(paper_ids)} papers.")

        results = [extract_relevant_data(paper_id) for paper_id in paper_ids]

        if filename:
            save_to_csv(results, filename)
            typer.echo(f"Results saved to {filename}")
        else:
            for result in results:
                typer.echo(result)

    except Exception as e:
        typer.echo(f"Error: {e}", err=True)

if __name__ == "__main__":
    typer.run(main)
