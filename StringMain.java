import java.util.Scanner;
class StringMain
{
public static void main(String[]args)
{
  Scanner sky=new Scanner(System.in);
  String str=sky.nextLine();
System.out.println("Enter str:");
String str1=sky.nextLine();
System.out.println("Enter str1:");
String str2=sky.nextLine();
System.out.println("Enter str2:");
String str3=sky.nextLine();
System.out.println("Enter str3:");
System.out.println(String.join(" ",str,str1,str2,str3));
}
}