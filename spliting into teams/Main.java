import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner obj= new Scanner(System.in);
  int n,t;
  n=obj.nextInt();
  t=obj.nextInt();
  System.out.println("The number of students in each team is "+ n/t +" and left out is "+ n%t);
}
}