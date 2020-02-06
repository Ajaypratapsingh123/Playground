import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj= new Scanner(System.in);
      int x,y;
      x=obj.nextInt();
      y=obj.nextInt();
      int temp;
      temp=x;
      x=y;
      y=temp;
      System.out.printf("%d\n%d",x,y);
        // fill your code
    }
}