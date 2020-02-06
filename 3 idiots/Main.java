import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner obj= new Scanner(System.in);
    int x1,y1,x2,y2;
    float x,y;
    x1=obj.nextInt();
    y1=obj.nextInt();
    x2=obj.nextInt();
    y2=obj.nextInt();
    x= (x1+x2)/2.0f;
    y= (y1+y2)/2.0f;
    
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",x,y);
    
    // fill your code
  }
}