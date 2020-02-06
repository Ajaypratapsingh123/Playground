#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;
};
void append(struct node **head,int);
 void display(struct node *head);
 void del(struct node **head);
int main()
{
    int ch,data;
    struct node *head=NULL;
    do{
   printf("Choice 1 : Enter element into Queue\nChoice 2 : Delete element from Queue\nChoice 3 : Display\nAny other choice : Exit\nEnter your choice\n");
   scanf("%d",&ch);
   switch(ch)
   {
       case 1: printf("Enter the element to be inserted/entered\n");
                scanf("%d",&data);
               append(&head,data);
                break;
       case 2: 
               del(&head);
               break;
       case 3: printf("The contents of the queue are ");
                display(head);
                break;
       default:exit(0);
   }}while(ch!=4);
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
        while(temp->next!=NULL){
            temp=temp->next;
        }
       temp->next=new_node;
       
    }
    }
    
    
   void display(struct node *head)
    {
     struct node *temp=head;
     if(temp==NULL)
     printf("{}");
while(temp!=NULL)
{
     printf("%d ",temp->data);
     temp=temp->next;
}
printf("\n");
    }
    void del(struct node **head)
{
    struct node *temp=*head,*next;
    if(temp==NULL)
    printf("Queue is empty\n");
    else{
        printf("The deleted element is ");
    *head=temp->next;
    printf("%d\n",temp->data);
    free(temp);}
}
    