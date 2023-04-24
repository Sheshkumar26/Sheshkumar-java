class Box
{
double width;
double height;
double depth;
Box()
{
width=-1;
height=-1;
depth=-1;
}
Box(double a, double b, double c)
{
width=a;
height=b;
depth=c;
}
double volume()
{
return width*height*depth;
}
}
class BoxWeight extends Box
{
double weight;
BoxWeight(double a, double b, double c,double d)
{
super(double a);
weight=d;
}
}
class BoxColor extends Box
{
String color;
BoxColor(double a, double b, double c,String d)
{
width=a;
height=b;
depth=c;
color=d;
}
}
class BoxShipment extends BoxWeight
{
double cost;
BoxShipment(double a, double b, double c,double d,double e)
{
super(a,b,c,d);
cost=e;
}
}
class Inheritance2
{
public static void main(String args[])
{
Box obj1=new Box(3.5,7.5,2.2);
System.out.println("Volume: "+obj1.volume());

System.out.println();

BoxWeight obj2=new BoxWeight(1.2,4.6,1.1,56.8);
System.out.println("Volume: "+obj2.volume());
System.out.println("Weight: "+obj2.weight);

System.out.println();

BoxColor obj3=new BoxColor(7.2,9.1,3.3,"Red");
System.out.println("Volume: "+obj3.volume());
System.out.println("Weight: "+obj3.color);

System.out.println();

BoxShipment obj4=new BoxShipment(7.6,4.1,3.3,2.1,456.3);
System.out.println("Volume: "+obj4.volume());
System.out.println("Weight: "+obj4.weight);
System.out.println("Weight: "+obj4.cost);
}
}