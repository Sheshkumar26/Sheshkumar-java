interface add_sub
{
 void ( double x, double y);
 void (double x, double y);

}

interface Mul_Div {
void ( double x, double y);
 void (double x, double y);
}

interface calculate extends Add_sub,Mul_Div {

public void print(double res)
{
System.out.println(res);

}

class Mycalculator implements calculatic
{
void Add( double x, double y)
{
print(x+y);
printResults(res);
}
void sub( double x, double y)
{
print(x-y);
printResults(res);
}
void Mul( double x, double y)
{
print(x*y);
printResults(res);
}
void Div( double x, double y)
{
print(x/y);
printResults(res);
}

class MainInterface
{
public static void main(Stringts[]args)
{

Mycalculator c=new Mycaluclator();

c.Add(7.5,8.9);
c.sub(1002,65);
c.Mul(12,14);
c.Div(65,13);
}
}