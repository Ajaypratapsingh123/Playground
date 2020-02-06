import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj= new Scanner(System.in);
int n= obj.nextInt();
int t1=0,t2=1,count=0,t3;
for(int i=1;i<=n;i++)
{
  count=count+1;
   if(count==n)
     System.out.print(t1);
  t3=t1+t2;
  t1=t2;
  t2=t3;
} 
    }
}