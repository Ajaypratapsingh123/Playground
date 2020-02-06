x=[]
y=[]
n=int(input())
flag=0
for i in range(n):
    x.append(input())
for i in range(n):
    y.append(input())
for i in range(n):
    if(x[i]>=y[i]):
        flag=1
        
    else:
        print("Not Compatible")
        break
if(flag==1):
    print("Compatible")
