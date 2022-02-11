import sys
import requests
import json
from skimage import io
import matplotlib.pyplot as plt



def TheDate(date):
    url = "https://api.nasa.gov/planetary/apod?api_key=qePfPVcjLU8utJfcAzNfNldQbieI41eyfReBgQUY&date="+date
    response = requests.get(url).json()
    img = response["hdurl"]
    info = response["explanation"]
    a = io.imread(img)
    plt.imshow(a)
    plt.show()
    print ("Date: "+ response["date"]+"\n")
    print("Details of the image : \n"+info+"\n")

def Image(id):
    url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?date="+date+"&id="+id
    response = requests.get(url).json()
    for i in response['photos']:
        if (i['id'] == id):
            img = i['img_src']
    a = io.imread(img)
    plt.imshow(a)
    plt.show()
    
date=input("Enter the date in YYYY-MM-DD mode")
id=input("Enter the id")
TheDate(date)
Image(id)