import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
        int c1=0,c2=0;
        for(int i=1;i<=n;i++)
        {
           int x= obj.nextInt();
           if(x<0)
             c1++;
          else
            c2++;
        }
      System.out.printf("Number of positive numbers is %d and the number of negative numbers is %d",c2,c1);
    }
}