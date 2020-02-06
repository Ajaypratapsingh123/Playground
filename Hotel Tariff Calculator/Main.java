import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
      int month,days;
      float amount;
        month= obj.nextInt();
        amount=obj.nextFloat();
       days= obj.nextInt();
      float fa;
      if(month==4 || month==5 || month==6 || month==11||month==12)
      {
        fa= amount*days;
        fa= (120/100.0f)*fa;
        System.out.printf("%.2f",fa);
      }
      else
      {
        System.out.println("Invalid Input");
      }
    }
}