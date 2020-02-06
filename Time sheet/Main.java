sum=0
hours=0
for i in range(7):
    a=int(input())
    if i==0:
        sum=sum+(a*150)
        if(a>8):
            sum=sum+(15*(a-8))
    if(i>=1 and i<6):
        sum=sum+(a*100)
        hours=hours+a
        if(a>8):
            sum=sum+(15*(a-8))
    if(i==6):
        if(hours>40):
            sum=sum+(25*(hours-40)) 
        sum=sum+(a*125)
        if(a>8):
            sum=sum+(15*(a-8))
print(sum)