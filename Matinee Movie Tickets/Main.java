import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int a= obj.nextInt();
       float b= obj.nextFloat();
if(((b>=00.00 && b<13.30) || (b>16.30 && b<=24.00)) && a>13)
  System.out.print("$8.00");
else if(((b>=00.00 && b<13.30) || (b>16.30 && b<=24.00)) && a<=13)
  System.out.print("$4.00");
else if((b>=13.30 && b<=16.30) && a>13)
  System.out.print("$5.00");
else if((b>=13.30 && b<=16.30)&& a<=13)
  System.out.print("$2.00");
else
  System.out.print("Invalid Input");
	}
}