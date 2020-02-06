import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
       int sun= obj.nextInt();
       int mon= obj.nextInt();
       int tue= obj.nextInt();
       int wed= obj.nextInt();
       int thu= obj.nextInt();
       int fri= obj.nextInt();
       int sat= obj.nextInt();

double a=(sun+mon+tue+wed+thu+fri+sat)*100;
if(sun>0)
  a=a+0.5*(sun*100);
if(sat>0)
  a=a+0.25*(sat*100);
if(mon>8){
  double m=mon-8;
  a=a+m*15;}
if(tue>8){
  int t=tue-8;
  a=a+t*15; }
if(wed>8){
  int w=wed-8;
  a=a+w*15; }
if(thu>8){
  int th=thu-8;
  a=a+th*15; }
if(fri>8){
  int f=fri-8;
  a=a+f*15; }
int s=mon+tue+wed+thu+fri;
if(s>40){
  s=s-40;
  a=a+s*25 ;}
System.out.print(a);
    }
}