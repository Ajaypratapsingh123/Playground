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
    struct node * temp;
    temp=(struct node *)malloc(sizeof(struct node));
    return(temp);
}
void insertnode()
{
    struct node *t,*n,*a;
    int x,count=0;
    scanf("%d",&x);
    while(x!=-1)
    {
        
      t=createnode();
      t->info=x;
      t->link=NULL;
      if(START==NULL)
      {
          START=t;
      }
      else
      {
          n=START;
          while(n->link!=NULL)
          n=n->link;
          n->link=t;
      }
      scanf("%d",&x);
    }
    printf("The students who are present in the class are\n");
       a=START;
       while(a!=NULL)
       {
           printf("%d ",a->info);
           a=a->link;
           count++;
       }
       printf("\nThe number of students who are present is %d.",count);
    
}
int main()
{
    insertnode();
    return(0);
}