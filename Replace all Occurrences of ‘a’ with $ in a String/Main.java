a=input()
b=''
for i in range(len(a)):
    if(a[i]=='A' or a[i]=='a'):
        b=b+'$'
    else:
        b=b+a[i]
      
print(b)