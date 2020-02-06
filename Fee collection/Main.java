import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      String x;
      String s="MSDS";
      String t="MSH";
      String u="MGSH";
      String v="MSGH";
        Scanner sc=new Scanner(System.in);
          x = sc.nextLine(); 
      float y =sc.nextFloat();
      float z=sc.nextFloat();
      float a =sc.nextFloat();
     if(x.compareTo(s)==0)
     {
      System.out.printf("%.2f" ,(y+z));
     }
     else
     {       
      if (x.compareTo(t)==0)
      {
       System.out.printf("%.2f" ,(y + a));
      }
       if(x.compareTo(u)==0)
       {
          System.out.printf("%.2f" ,(1.5*y + a));
       }
        else
       {
          System.out.printf("Invalid");
       }
     }
    }
}