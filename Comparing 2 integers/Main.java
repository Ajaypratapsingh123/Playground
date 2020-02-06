import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
       Scanner obj= new Scanner(System.in);
      int x,y;
      x=obj.nextInt();
      y=obj.nextInt();
      if(x==y)
        System.out.printf("%d and %d are equal",x,y);
      else if(x>y)
        System.out.printf("%d greater than %d",x,y);
      else
         System.out.printf("%d less than %d",x,y);
    }
}