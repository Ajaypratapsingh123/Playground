a=[]
i=0
n = int(input())
while(n!=0):
  a.append(int(input()))
  n=n-1
  for j in range(len(a)-1):
    if(a[j]==a[i]):
      a.remove(a[j])
      i=i-1
  i=i+1
print('Non-duplicate items:')
print(a)