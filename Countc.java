

class Countc

{
 public static void main(String args[])

{
  String string = "Hello Sky ,How are you?";
  int count=0;

for(int i = 0; i < string.length();i++) {
  if(string.charAt(i)!=' ')
      count++; 
}
  
System.out.print("Total number of character is: " +count);

}
}