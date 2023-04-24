import java.util.Scanner;
class Input
{
public static void main(String[]args)

{
  Scanner sky = new Scanner(System.in);
  String name = sky.nextLine();
  System.out.println(name);
  int Age = sky.nextInt();
  System.out.println(Age);
  double salary = sky.nextDouble(); 
  System.out.println(salary);
   char Grade = sky.next().charAt(0);
   System.out.println(Grade);


}
}