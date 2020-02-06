import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner obj= new Scanner(System.in);
      int n= obj.nextInt();
      int t1=0,t2=0,t3=1;
for(int i=1;i<=n;i++)
{ 
  System.out.print(t1);
  int t4=t1+t2+t3;
  t1=t2;t2=t3;t3=t4;
  System.out.print(" ");
}
    }
}