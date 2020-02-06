#include<stdio.h>
#include<stdlib.h>
struct node
{
  int info;
  struct node * link;
};
struct node *START=NULL;
struct node *createnode()
{
    struct node *temp;
    temp=(struct node *)malloc(sizeof(struct node));
    return(temp);
}
void insertnode(int x)
{
    struct node *t,*n;
    t=createnode();
    t->info=x;
    if(START==NULL)
    {
        START=t;
    }
    else
    {
        n=START;
        START=t;
        t->link=n;
    }
}
void traverse()
{
    struct node *a;
    a=START;
    while(a->link!=NULL)
    {
        printf("%d ",a->info);
        a=a->link;
    }
     printf("%d ",a->info);
}
int main()
{ 
    int x;
    scanf("%d",&x);
   while(x!=-1)
   {
    insertnode(x);
    scanf("%d",&x);
   }
    traverse();
    return(0);
}