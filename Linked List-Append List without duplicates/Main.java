#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;
};
void append(struct node **head,int);
 void display(struct node *head);
int main()
{
    struct node *head=NULL;
    int data;
    do
    {
    scanf("%d",&data);
    if(data>0)
    append(&head,data);
    }while(data>-1);
    printf("The assigned roll numbers are: ");
    display(head);
    return 0;
}

   void append(struct node **head,int data)
    {
        struct node *temp,*new_node;
        temp=*head;
    new_node=(struct node*)malloc(sizeof(struct node));
    new_node->next=NULL;
    new_node->data=data;
    if(*head==NULL)
    {
        *head=new_node;
    }
    else{
    while(temp->next!=NULL)
        temp=temp->next;
    temp->next=new_node;
    }
    }
    
    
   void display(struct node *head)
    {
        
     struct node *temp=head,*temp1;
     int data;
     while(temp!=NULL)
     {
         int count=0;
         data=temp->data;
         temp1=head;
         while(temp1!=temp){
            if(temp1->data==data)
            count++;
            temp1=temp1->next;}
         if(count==0)
            printf("%d ",temp->data);
         temp=temp->next;
     }
    }
    