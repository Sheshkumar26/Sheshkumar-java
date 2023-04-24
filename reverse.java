class reverse

 {
   public static void main(String args[])
{

   int a=4561;
   Reverse=0;

 while(a!=0) {
int i =a%10;
Reverse=Reverse*10 + i;
a/=10;
}
System.out.println("The Reversed number is :" +Reverse);
}
}
   
