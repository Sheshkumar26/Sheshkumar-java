import java.util.Scanner;

class ExceptionHandling
{
public static void main(String[]args)
{

try{
int x =125/0;
System.out.println(x);



}
catch (ArithmeticException a)

{
System.out.println(a);

System.out.println("Denominator is zero");
}

finally
{
System.out.println("JAI SHREE RAM");
}

}
}