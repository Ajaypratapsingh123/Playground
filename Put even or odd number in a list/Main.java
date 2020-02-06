x=[]
y=[]
z=[]
n=int(input())
for i in range(n):
    x.append(int(input()))
for i in range(n):
    if(x[i]%2==0):
        y.append(x[i])
    else:
        z.append(x[i])
print(y)
print(z)