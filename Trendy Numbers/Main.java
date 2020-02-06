import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
      int n,mid;
      n= obj.nextInt();
int count=0;
int copy=n;
while(copy>0)
{
  copy=copy/10;
  count=count+1;
}
if(count==3)
{
    mid= (n/10)%10;
  if(mid%3==0)
    System.out.print("Trendy Number");
  else
    System.out.print("Not a Trendy Number");
}   
else
{
  System.out.print("Not a Trendy Number");
    
}
    }
}