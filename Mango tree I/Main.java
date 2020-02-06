import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int r= obj.nextInt();
        int c= obj.nextInt();
      int n= obj.nextInt();
      if(n<=c || n%c==1 || n %c==0)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}