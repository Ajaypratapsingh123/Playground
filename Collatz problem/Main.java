x=int(input())
count=(0)
print(x)
while(x!=1):
  if(x%2==1):
    x=x*3+1
    print(x)
    count+=1
    if(x==1):
      break
  else:
    x=x//2
    print(x)
    count+=1
    if(x==1):
      break
print(count)
  