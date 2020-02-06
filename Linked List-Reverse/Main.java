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
    struct node *t,*a,*u,*d;
      int x,i=0,count=0,comp=0,max,z[100];
    scanf("%d",&x);
    while(x!=-1)
    {
      t=createnode();
     t->info=x;
     if(START==NULL)
     {
     START=t;
     t->link=NULL;
     }
     else
     {
         a=START;
        while(a->link!=NULL)
        {
            a=a->link;
        }
        a->link=t;
        t->link=NULL;
     }
    scanf("%d",&x);
 
    } 
    printf("The students are seated in the order:");
    d=START;
    while(d!=NULL)
    {
        printf(" %d",d->info);
        d=d->link;
        count++;
    }
    printf("\n");
         u=START;
         i=count;
         while(u!=NULL)
         {
             z[i]=u->info;
             u=u->link;
             i--;
         }
         printf("After reversing the students are seated in the order:");
         for(i=1;i<=count;i++)
         {
             printf(" %d",z[i]);
         }
     
}
int main()
{
 insertnode();
 return(0);
}