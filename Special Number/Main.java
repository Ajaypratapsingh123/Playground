a= int(input())
z= int(input())
for i in range(a,z):
    b=i%10
    c=i//10
    if((b+c)+(b*c)==i):
        print(i)