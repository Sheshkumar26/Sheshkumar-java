import java.util.Scanner;
class Shape
{
double size1, size2;


Shape(double a,double b)
{
this.size1=a;
this.size2=b;

}
double area(double a, double b){

double area =a*b;

System.out.println("Area:" +area);
return  a*b;
}
}

class Rectangle extends Shape{

Rectangle (double a, double b){
super(a,b);
double width=a;
double length=b;
}

double area (double width, double length){
double d= width*length;
System.out.println("area of Rectangle:" +d);
return width*length;
}
}

class Triangle extends Shape{

Triangle(double a, double b){
super(a,b);
double Base=a;
double Height=b;
}

double area (double Base, double Height){
double t= (Base*Height)/2;
System.out.println("area of Triangle:" +t);
return Base*Height*0.5;
}
}

class MainShape
{
public static void main(String[]args){
Scanner sky=new Scanner(System.in);
System.out.println("Enter dimension1:");
double size1=sky.nextDouble();
System.out.println("Enter dimension2:");
double size2=sky.nextDouble();
Shape G=new Shape(size1,size2);
Rectangle r=new Rectangle(size1,size2);
Triangle t=new Triangle(size1,size2);

G.area(size1,size2);
r.area(size1,size2);
t.area(size1,size2);
}
}
