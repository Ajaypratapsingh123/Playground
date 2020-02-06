#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
struct node
{
 int info;
 struct node *link;
};
struct node *START=NULL;
struct node *createnode()
{
    struct node *temp;
    temp=(struct node*)malloc(sizeof(struct node));
    return(temp);
}
void insertnode()
{
    struct node *t,*a;
      int x,i,count=0,comp=0,max;
    scanf("%d",&x);
    while(x!=-1)
    {
     t=createnode();
     t->info=x;
     if(START==NULL)
     START=t;
     else
     {
         a=START;
        while(a->link!=NULL)
        {
            a=a->link;
        }
        a->link=t;
     }
    scanf("%d",&x);
    }
    printf("The students marks are:\n");
     a=START;
     while(a!=NULL)
     {
         printf("%d ",a->info);
         a=a->link;
     }
     a=START;
        max=a->info;
        while(a!=NULL)
        {
            if(max<a->info)
            {
                max=a->info;
            }
            a=a->link;
        }
     printf("\nThe maximum mark is %d.",max);
}
int main()
{
    insertnode();
    return 0;
}