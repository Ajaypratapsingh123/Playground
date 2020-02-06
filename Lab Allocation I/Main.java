import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj= new Scanner(System.in);
      int x,y,z;
      x= obj.nextInt();
      y= obj.nextInt();
      z= obj.nextInt();
      if(x<y && x<z)
      {
        System.out.println("L1");
      }
      else if(y<z && y<x)
      {
        System.out.println("L2");
      }
      else
      {
        System.out.println("L3");
      }
    }
}