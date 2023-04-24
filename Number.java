import java.util.Scanner;

class Number

{
 public static void main (String args[])

{

 Scanner sc= new Scanner(System.in);

 System.out.println("Enter a value:");

 int num= sc.nextInt();

System.out.println((num%2>0)?"'_'":"invalid input");

}
}