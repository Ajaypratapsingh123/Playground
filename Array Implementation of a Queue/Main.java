#include<stdio.h>
#include<stdlib.h>
int front=0,rear=-1,*a;
void enqueue(int d,int max,int a[])
{
    if(rear-front==max-1)
    {
        printf("Queue is full\n");
    }
    else
    {
        a[++rear]=d;
    }
}
void dequeue(int a[])
{
    if(front>rear)
    {
        printf("Queue is empty\n");
    }
    else
    {
        printf("The deleted element is %d\n",a[front++]);
        
    }
}
void display(int maxSize,int a[])
{
    int i;
    if(rear<front)
    {
        printf("The contents of the queue are {}\n");
    }
    else
    {
        printf("The contents of the queue are ");
        for(i=front;i<=rear;i++)
        {
            printf("%d ",a[i]);
        }
        printf("\n");
    }
}
int main()
{
    int c,d,maxSize=5;
    a=(int*)malloc(10*sizeof(int));
    do
    {
        printf("Choice 1 : Enter element into Queue\nChoice 2 : Delete element from Queue\nChoice 3 : Display\nAny other choice : Exit\nEnter your choice\n");
        scanf("%d",&c);
        switch(c)
        {
            case 1: printf("Enter the element to be inserted/entered\n");
                    scanf("%d",&d);
                    enqueue(d,maxSize,a);
                    break;
            case 2: dequeue(a);
                    break;
            case 3: display(maxSize,a);
                    break;
            default: return 0;
        }
    }
    while(1);
    return 0;
}