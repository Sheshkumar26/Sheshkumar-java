
import java.util.Scanner;

class Division
{
public static void main(String[]args)
{

Scanner sky = new Scanner(System.in);

int a,b,c;

System.out.println("Enter the value of a:"+a);
System.out.println("Enter the value of b:"+b);
try
{
int a =sky.nextInt();
int b =sky.nextInt();
if(b==0)
{
throw b;
}
int c = a/b;

System.out.println("Division :"+c);
}
catch(int x)
{
System.out.println("Denominator is zero");
}
}
}
