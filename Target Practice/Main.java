import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner obj= new Scanner(System.in);
int target;
      target= obj.nextInt();
int sum=0,count=0;
while(true)
{
  int n= obj.nextInt();
  count=count+1;
  sum=sum+n;
  if(sum>= target)
  {
    System.out.printf("The number of turns is %d",count);
    break;
   }
}
    }}