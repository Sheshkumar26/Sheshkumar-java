import java.util.Scanner;

class Vowels

{
public static void main(String args[])

{

int total=0; 
String obj=new String("welcome to my universe buddy");

for(int i = 0; i < obj.length(); i++) {

if(obj.charAt(i) == 'a' || obj.charAt(i) == 'e' || obj.charAt(i) == 'i' || obj.charAt(i) == 'o' || obj.charAt(i) == 'u' )
{
total++;
 //System.out.println("Given string contains " +obj.charAt(i)+" at the index" +i);
 System.out.println("Total numbers of vowels" +total) ;
}
}
}
}