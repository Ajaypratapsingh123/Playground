import math
n=int(input())
i=1
flag=0
while(n!=0):
    if(flag==0):
        print(pow(i,2)-1,end=' ')
        flag=1
    else:
        flag=0
        print(pow(i,2)-2,end=' ')
    i=i+1
    n=n-1