import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner obj= new Scanner(System.in);
      int a= obj.nextInt();
      int b= obj.nextInt();
      int c= obj.nextInt();
      int d= obj.nextInt();
      int e= obj.nextInt();
      double sum=(a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90);
     if(sum<=15000)
       System.out.print("Yes");
    else
       System.out.print("No");

				
	}
}