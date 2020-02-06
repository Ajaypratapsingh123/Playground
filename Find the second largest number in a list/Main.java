x=[]
n=int(input())
for i in range(n):
    x.append(int(input()))
y=max(x)
x.remove(y)
print(max(x))
