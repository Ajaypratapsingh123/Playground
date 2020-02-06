import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        int count=0;
         System.out.println(n);
while(true)
{
  if(n==1)
    break;
  else if(n%2==0)
  {
    n=n/2;
    System.out.println(n);
    count=count+1;
  }
  else
  {
    n= 3*n+1;
    System.out.println(n);
    count=count+1;
  }
}
System.out.println(count);
    
    }
}