import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n;
          n= obj.nextInt();
int count=0,sq=n*n,copy=sq;
while(copy>0)
{     
  count=count+1;
  copy=copy/10;
} 
if(count>2)
{
  int n1= sq/ (int)(Math.pow(10,(count-2)));
  int n2= sq% (int)(Math.pow(10,(count-2)));
  int sum= n1+n2;
  if(sum==n)
    System.out.print("Kaprekar Number");
  else
    System.out.print("Not a Kaprekar Number");
}
else
  {
    int sum1= (sq/10)+(sq%10);
    if(sum1==n)
      System.out.print("Kaprekar Number");
    else
      System.out.print("Not a Kaprekar Number");
   }
    }
}