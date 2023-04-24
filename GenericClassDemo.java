class Gen<T1, T2>

{
T1 num1;
T2 num2;
Gen()
{

}

Gen(T1 x, T2 y)
{
num1= x;
num2= y;
}

T1 print1()
{
return num1;
}

T2 print2()
{
return num2;
}
}
class GenericClassDemo
{
public static void main(String[]args)
{

Gen<Integer, String> obj1 =new Gen<Integer,String>(101, "Shesh");

System.out.println(obj1.print1());
System.out.println(obj1.print2());


Gen<String , String> obj2 =new Gen<String, String>("Jai Shree Ram", "JAi jai Shree Ram");
System.out.println(obj2.print1());
System.out.println(obj2.print2());
}
}