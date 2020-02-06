#include<stdio.h>
#include<stdlib.h>
int top=-1,*a;
void push(int d,int max,int a[])
{
    if(top==max-1)
    {
        printf("Stack is full\n");
    }
    else
    {
        a[++top]=d;
    }
}
void pop(int a[])
{
    if(top==-1)
    {
        printf("Stack is empty\n");
    }
    else
    {
        printf("The popped element is %d\n",a[top--]);
    }
}
void display(int maxSize,int a[])
{
    int i;
    if(top==-1)
    {
        printf("The contents of the stack are {}\n");
    }
    else
    {
        printf("The contents of the stack are ");
        for(i=0;i<maxSize;i++)
        {
            printf("%d ",a[i]);
        }
        printf("\n");
    }
}
int main()
{
    int c,d,maxSize;
    printf("Enter the maximum size of the stack\n");
    scanf("%d",&maxSize);
    a=(int*)malloc(maxSize*sizeof(int));
    do
    {
        printf("Choice 1 : Push\nChoice 2 : Pop\nChoice 3 : Display\nAny other choice : Exit\nEnter your choice\n");
        scanf("%d",&c);
        switch(c)
        {
            case 1: printf("Enter the element to be pushed\n");
                    scanf("%d",&d);
                    push(d,maxSize,a);
                    break;
            case 2: pop(a);
                    break;
            case 3: display(maxSize,a);
                    break;
            default: return 0;
        }
    }
    while(1);
    return 0;
}