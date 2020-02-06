n=float(input())
a=1
flag=0
print(a,end=' ')
while(n!=1):
  if(flag==0):
    flag=1
    a=a*2
  else:
    flag=0
    a=a*3/2
  print('%0.1f'%a,end=' ')
  n=n-1

