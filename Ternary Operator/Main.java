import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n;
        n= obj.nextInt();
         String out;
        out= (n%2==0)?"Even":"Odd";
       System.out.println(out);
    }
}