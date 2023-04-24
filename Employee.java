   import java.util.Scanner;

class Employee

 {
 public static void main(String []args)

{ 
Scanner Obj = new Scanner(System.in);

String name;
int age;
float salary;
char Grade;
    

System.out.println("Enter  age:");

int age = Obj.nextInt();
System.out.println("Enter  name:");

String name = Obj.nextline();

System.out.println("Enter  grade:");

 Char grade = Obj.next().charAt(0);

System.out.println("Enter  Salary:");

Float salary = Obj.nextFloat();

System.out.println("Age:"+ age);
System.out.println("Name:"+name);
System.out.println("Grade:"+grade);
System.out.println("Salary:"+salary);


}
}