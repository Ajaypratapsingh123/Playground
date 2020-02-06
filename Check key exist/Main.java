flag=0
a={'A':1,'B':2,'C':3}
m=input()
if m in a:
  print(a[m])
else:
  flag=1
if(flag==1):
  print("Key isn't present")