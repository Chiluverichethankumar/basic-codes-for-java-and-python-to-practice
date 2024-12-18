import java.util.*;

public class Programs {

    // Fibonacci series
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.

    public void Fibonacci_Series(int n) {
        int n1, n2, temp;
        n1 = 0;
        n2 = 1;
        temp = 0;

        for (int i = 0; i < n; i++) {
            temp = n1 + temp;
            System.out.print(temp + " ");
            n1 = n2;
            n2 = temp;
        }

    }

    // Factorial
    // 4! = 4*3*2*1 = 24 , 5! = 5*4*3*2*1 = 120

    public void Factorial(int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp = i * temp;
        }
        System.out.print(temp);
    }

    // Palindrome
    // same forward and backward
    // radar, level, madam, 12321, and A man, a plan, a canal, Panama!

    public void Palindrome(int n) {

        int mod, sum = 0;
        // for (int temp = n; temp > 0; temp = temp / 10) {
        // mod = temp % 10;
        // sum = (sum * 10) + mod;

        // }
        int temp = n;
        while (temp > 0) {
            mod = temp % 10;
            sum = (sum * 10) + mod;
            temp = temp / 10;
        }
        if (sum == n)
            System.out.println(n + " Palindrome");
        else
            System.out.println(n + " not Palindrome");

    }

    public static void main(String args[]) {
        Scanner Myscn = new Scanner(System.in);
        Programs Myobj = new Programs();

        // Fibonacci series

        // System.out.println("Fibonacci_Series" + "\n" + "Enter number:");
        // int Fibonacci = Myscn.nextInt();
        // Myobj.Fibonacci_Series(Fibonacci);

        // Factorial

        // System.out.println("Factorial" + "\n" + "Enter number:");
        // int Factorial = Myscn.nextInt();
        // Myobj.Factorial(Factorial);

        // Palindrome

        System.out.println("Palindrome" + "\n" + "Enter number:");
        int Palindrome = Myscn.nextInt();
        Myobj.Palindrome(Palindrome);

    }

}
