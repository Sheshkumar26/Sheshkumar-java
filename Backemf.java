import java.util.Scanner;

class Backemf

{
public static void main(String[]args)

{

 String str="suryanamaskar",nstr="";

char ch;

System.out.println("original word:");

System.out.println("suryanamaskar");

for (int i=0;i<str.length();i++)
{
ch=str.charAt(i);
nstr= ch+nstr;
}
System.out.println("Reversed word: "+ nstr);
}
}