i=0
marks=0.0
while(i!=3):
    a=int(input())
    if(a>=0 and a%2==1):
        marks=marks+1
    if(a>=0 and a%2==0):
        marks=marks-0.5
    if(a<0):
        marks=marks-1;
        break;
    i=i+1

print(marks)