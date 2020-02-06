a= int(input())
fact=1;
value=1;
while(fact<=a/2):
    fact=fact*value
    if(fact==a):
        print('Yes')
        exit()
    value=value+1;
print('No')