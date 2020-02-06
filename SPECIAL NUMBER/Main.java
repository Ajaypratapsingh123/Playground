import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner obj= new Scanner(System.in);
      int n,m,dsum=0,psum=0;
      n = obj.nextInt();
      m = obj.nextInt();
      for(int i=n;i<=m;i++)
      {
         dsum= (i%10)+(i/10);
         psum= (i%10)*(i/10);
        if(i == (psum+dsum))
           System.out.println(i);
    }
    }
}