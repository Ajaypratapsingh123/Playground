import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
      int res=1,flag=0;
        for(int i=1;i<=n;i++)
        {
                 res=res*i;
                 if(res==n)
                   flag=1;
        }
      if(flag==1)
        System.out.print("Yes");
      else
        System.out.print("No");
}
}