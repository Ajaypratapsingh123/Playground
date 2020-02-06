import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
      Scanner obj= new Scanner(System.in);
      int x1,y1,r1,x2,y2,r2;
      x1=obj.nextInt();
      y1=obj.nextInt();
      r1=obj.nextInt();
      x2=obj.nextInt();
      y2=obj.nextInt();
      r2=obj.nextInt();  
int  d=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
double x= Math.sqrt(d);
 int  d1=(int) x;
int d2=r1+r2;
if(d1==d2)
  System.out.print("Tangential");
else if(d1>d2)
   System.out.print("Do not overlap");
else
  System.out.print("Overlap");
  }
}