from django.shortcuts import render
from django.http import HttpResponse
import datetime

TEMPLATE_DIRS=(
    'os.path.join(BASE_DIR, "templates")'
)
def index(request):

    return render(request,'index.html')