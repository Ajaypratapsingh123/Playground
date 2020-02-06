import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner obj= new Scanner(System.in);
      int x,y,z;
      String s1;
      x= obj.nextInt();
      y= obj.nextInt();
      z= obj.nextInt();
      s1= obj.next();
      if(s1.equals("L1")== true)
      {
        if(y<z)
          System.out.println("L2");
        else
           System.out.println("L3");
      }
      else if(s1.equals("L2")== true)
      {
        if(x<z)
          System.out.println("L1");
        else
           System.out.println("L3");
      }
     else if(s1.equals("L3")== true)
      {
        if(x<y)
          System.out.println("L1");
        else
           System.out.println("L2");
      }
        //fill the code;
    }
}