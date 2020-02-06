import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
      int x;
        x= obj.nextInt();
        if(x==100)
          System.out.println("S");
      else if(x>=90 && x<=99)
         System.out.println("A");
       else if(x>=80 && x<=89)
         System.out.println("B");
       else if(x>=70 && x<=79)
         System.out.println("C");
       else if(x>=60 && x<=69)
         System.out.println("D");
      else if(x>=50 && x<=59)
         System.out.println("E");
      else if(x<50)
        System.out.println("F");
      else
        System.out.println("Invalid Input");
    }
}