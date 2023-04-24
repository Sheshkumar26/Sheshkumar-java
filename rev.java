class rev

 {
   public static void main(String args[])
{

   int a=4561;
   rev=0;

 while(a!=0) {
int i =a%10;
rev=rev*10 + i;
a/=10;
}
System.out.println("The reversed number is :" +rev);
}
}
   
