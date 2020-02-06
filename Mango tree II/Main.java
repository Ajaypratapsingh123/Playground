import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
        int r= obj.nextInt();
        int c= obj.nextInt();
      int n= obj.nextInt();
      if(n<=r || n%r==1 ||( n>(r-1)*c && n<= (r*c) ) )
        System.out.println("yes");
      else
        System.out.println("No");
	}
}