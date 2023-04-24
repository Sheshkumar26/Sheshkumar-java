import java.util.Scanner;

class infer
{

 int num1;
int num2;
 infer()
{
Scanner sky=new Scanner(System.in);
num1=sky.nextInt();
num2=sky.nextInt();
}
int calculate()
{
int multiply=num1*num2;
//System.out.println(multiply);
return (multiply);
}
}
class MainInfer
{
public static void main(String []args)
{

  infer  obj =new infer();
 int result=obj.calculate();
  
System.out.println(result);
}
}