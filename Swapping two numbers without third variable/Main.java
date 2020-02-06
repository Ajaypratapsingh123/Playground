import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner obj= new Scanner(System.in);
      int x,y;
      x=obj.nextInt();
      y=obj.nextInt();
      x=x+y;
      y=x-y;
      x=x-y;
      System.out.printf("%d\n%d",x,y);
      
    }
}