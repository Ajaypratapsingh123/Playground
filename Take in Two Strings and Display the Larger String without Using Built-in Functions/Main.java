a=input()
b=input()
counta=0
countb=0
for i in a: 
  counta=counta+1
for i in b:
  countb=countb+1
if(counta>countb):
  print(a)
else:
  print(b)