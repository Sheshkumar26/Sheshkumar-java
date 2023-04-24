import java.util.Scanner;

class Var_args
{

 void print_Varargs(int...a)
{

System.out.println("Number of variable arguments:" + a.length);
for(int i:a)
{
System.out.println(i);
}
}
}
class MainVarargs{
public static void main(String[]args)
{
Var_args vob=new Var_args();
vob.print_Varargs(10,12,56);
}
}
