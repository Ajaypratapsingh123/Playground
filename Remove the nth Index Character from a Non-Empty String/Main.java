n=input()
b=''
i=int(input())
for k in range(len(n)):
  if(k==i):
    continue
  else:
    b=b+n[k]
print(b)