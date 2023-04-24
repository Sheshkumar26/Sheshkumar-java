import java.util.Scanner;

class  Fukrey
{
public static void main (String args[])

{

 Scanner obj= new Scanner(System.in);

 String Name;
 int Age;
float Salary;
char grade;


System.out.println("Enter Name:");
  Name= obj.nextLine();

System.out.println("Enter Age:");
Age= obj.nextInt();

System.out.println("Enter Salary:");
Salary= obj.nextFloat();

System.out.println("Enter grade:");
grade = obj.next().charAt(0);

System.out.println("Name:" +Name);
System.out.println("Age :" +Age);
System.out.println("Salary:" +Salary);
System.out.println("Grade:" +grade);

}
}

 
