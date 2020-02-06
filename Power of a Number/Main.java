import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
       int b,p,res;
      b= obj.nextInt();
      p= obj.nextInt();
     res=1;
      for(int i=1;i<=p;i++)
      {
        res=res*b;
      }
      System.out.println(res);
    }
}