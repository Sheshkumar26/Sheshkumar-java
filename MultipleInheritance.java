interface details
{
void display();
}
class student
{
String name;
int roll_number;
double marks1;
double marks2;

student(String n , int r, double m1, double m2)
{
name = n;
roll_number = r;
marks1 = m1;
marks2 = m2;
}
void print()
{
System.out.println("Name: " +name);
System.out.println("Roll_number: " +roll_number);
System.out.println("Marks1: " +marks1);
System.out.println("Marks2: " +marks2);
}
}

class Results extends student implements details
{

Results (String n , int r, double m1, double m2)
{
super(n, r, m1, m2);
}
public void display()
{
print();
double average =(marks1+marks2)/2;
System.out.println("Average: " +average);
}
}

class MultipleInheritance
{
public static void main(String[]args)
{
Results r =new Results("Sky",26,89.25,91.25);
r.display();

}
}












