count=0
while(True):
  a=int(input())
  if(a%8==0):
      count=count+1
  else:
      break;
print('The number of valid numbers entered is %d'%count)