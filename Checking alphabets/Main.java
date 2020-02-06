import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner obj= new Scanner(System.in);
         char ch;
         ch=obj.next().charAt(0);
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
           System.out.println("Vowel");
       else if(ch>='a' && ch<='z')
          System.out.println("Consonant");
      else
        System.out.println("Not an alphabet");
    }
}