import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
      int s1,s2;
        s1= obj.nextInt();
        s2= obj.nextInt();
      if(s2<s1)
        System.out.print(s2+100-s1);
      else
          System.out.print(s2-s1);     
    }
}