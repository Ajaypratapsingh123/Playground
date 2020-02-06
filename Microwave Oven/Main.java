import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
      int a= obj.nextInt();
      float b= obj.nextFloat();
if(a==2)
  System.out.print(b+b/2);
else if(a==3)
  System.out.print(2*b);
else
  System.out.print("Number of items is more");
	}
}