#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct node
{
    int data;
    struct node* left;
    struct node* right;
};
void append(struct node **root,int);
void inorder(struct node *root);
void preorder(struct node *root);
void postorder(struct node *root);
int main()
{
    struct node *root=NULL;
    int data;
    char a[5];
    do
    {
    printf("Enter the element to be inserted in the tree\n");
    scanf("%d",&data);
    if(data>0)
    append(&root,data);
    printf("Do you want to insert another element?\n");
    scanf("%s",a);
    }while( (strcmp(a,"no")));
printf("Inorder Traversal: The elements in the tree are ");    
inorder(root);
printf("\n");
printf("Preorder Traversal: The elements in the tree are ");
preorder(root);
printf("\n");
printf("Postorder Traversal: The elements in the tree are ");
postorder(root);
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
    }
        
    }
    
    
 void inorder(struct node *root)
    {
    struct node *temp=root;
    if(temp==NULL)
    return;
    inorder(temp->left);
    printf("%d ",temp->data);
    inorder(temp->right);
    }
    
void preorder(struct node *root)
    {
     struct node *temp=root;
    if(temp==NULL)
    return;
    printf("%d ",temp->data);
    preorder(temp->left);
    preorder(temp->right);
    }
    
void postorder(struct node *root)
    {
    struct node *temp=root;
    if(temp==NULL)  
    return;
    postorder(temp->left);
    postorder(temp->right);
    printf("%d ",temp->data);
    }
    