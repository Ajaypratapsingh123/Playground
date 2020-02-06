#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* left;
    struct node* right;
};
void append(struct node **root,int);
 void display(struct node *root);
int main()
{
    struct node *root=NULL;
    int data;
    do
    {
    scanf("%d",&data);
    if(data>0)
    append(&root,data);
    }while(data>-1);
    display(root);
    return 0;
}

   void append(struct node **root,int data)
    {
        struct node *temp,*new_node;
        temp=*root;
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->left=NULL;
        new_node->right=NULL;
        new_node->data=data;
    if(*root==NULL)
    
        *root=new_node;
    
    else{
        while(1){
        if(data<temp->data)
            if(temp->left!=NULL)
            temp=temp->left;
            else{
            temp->left=new_node;
            break;}
        else if(temp->right!=NULL)
  
        temp=temp->right;
            else{
            temp->right=new_node;
            break;}
    }
    }}
    
    
   void display(struct node *root)
    {
     struct node *temp=root;
if(temp==NULL)
return;
display(temp->left);
printf("%d\n",temp->data);
display(temp->right);
    }
    