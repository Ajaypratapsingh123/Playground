#include<stdio.h>
#include<stdlib.h>
int main()
{
   int top=-1;
   char str[50];
   int i=0,stack[50],a,b,c;
   printf("Enter postfix expression to be evaluated:\n");
   scanf("%s",str);
   
   while(str[i]!='\0')
   {
   if(str[i]>='0' && str[i]<='9')
   
       stack[++top]=str[i]-'0';
  else{
  if(str[i]=='+')
     {
        a=stack[top--];
        b=stack[top];
        stack[top]=a+b;
     }
     if(str[i]=='-')
     {
        a=stack[top--];
        b=stack[top];
        stack[top]=a-b;
     }
     if(str[i]=='*')
     {
        a=stack[top--];
        b=stack[top];
        stack[top]=a*b;
     }
     if(str[i]=='/')
     {
        a=stack[top--];
        b=stack[top];
        stack[top]=a/b;
     }}
  i++;
}
   printf("Result is: %d",stack[top]);
    return 0;
}