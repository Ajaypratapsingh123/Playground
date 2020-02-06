n = int(input())
sum=0
counte=0
while(n!=0):
  a=int(input())
  if(a>=0):
    counte=counte+1
    sum=sum+a
  n=n-1
  
print('Number of positive numbers entered is %d and the sum is %d'%(counte,sum))