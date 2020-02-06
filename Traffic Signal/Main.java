import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
          float a=sc.nextFloat();
          float b=sc.nextFloat();
          float c=sc.nextFloat();
      if(((a*c)/3600)<b)
  		System.out.println("No");
		else
		System.out.println("Yes");
          
    }
}