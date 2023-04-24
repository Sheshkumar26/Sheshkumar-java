import java.util.Scanner;

class Calculator
{
public static void main(String[]args)

{
String operator;

double num1,num2,result;
Scanner sky=new Scanner(System.in);

System.out.println("select an operator:"addition","substraction","multilplication","division","modulus" ");

operator=sky.nextLine();

System.out.println("Enter num1");
num1=sky.nextDouble();

System.out.println("Enter num2");
num2=sky.nextDouble();

switch(operator)
{

case'multiplication':

 result=num1*num2;
System.out.println(num1 + " * " + num2 + " = " +result);

break;

case'addition':

 result=num1+num2;
System.out.println(num1 + " + " + num2 + " = " +result);
break;

case'substraction':

 result=num1-num2;
System.out.println(num1 + " - " + num2 + " = " +result);
break;

case'division':

 result=num1/num2;
System.out.println(num1 + " / " + num2 + " = " +result);
break;

case'modulus':

 result=num1%num2;
System.out.println(num1 + " % " + num2 + " = " +result);
break;

default:
   System.out.println("invalid operator!");
break;

}

  
}
}

