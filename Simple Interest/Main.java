import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner obj= new Scanner(System.in);
         int p,t;
      float r,si;
       p= obj.nextInt();
       t= obj.nextInt();
      r= obj.nextFloat();
      si= (p*t*r)/100;
      System.out.printf("%.2f",si);
        // fill your code
    }
}