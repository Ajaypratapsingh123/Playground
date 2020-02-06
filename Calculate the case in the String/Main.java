a=input()
countu=0
countl=0
for i in range(len(a)):
  if(a[i].isupper()):
    countu=countu+1
  else:
    countl=countl+1
print(countl)
print(countu)