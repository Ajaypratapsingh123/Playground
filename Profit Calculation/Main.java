import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
      int x,a,b,res;
      x= obj.nextInt();
      a= obj.nextInt();
      b= obj.nextInt();
      res= (x*a)-(x*b)-100;
      System.out.println("The profit obtained is Rs."+res);
	}
}