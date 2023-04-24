import java.util.Scanner;

class Themenu

{
 public static void main(String[]args)

{
 
 

int balance = 10000, withdraw = 0, dept;
 Scanner obj = new Scanner(System.in);

while(true){

System.out.println("select 1 for withdraw");
System.out.println("select 2 for dept");
System.out.println("select 3 for check balance ");
System.out.println("select 4 for exit");
System.out.println("select what to do");

int n=obj.nextInt();

switch(n){
case 1:

 System.out.println("enter the amount for wid:");

if(balance >= withdraw){

balance=balance-withdraw;
System.out.println("paise lele bhai:");

}
else {
System.out.println("bhag bhsdk:");

}
System.out.println(" ");
break;

case 2:
System.out.println("enter  the amount for dept:");
dept=obj.nextInt();

balance=balance + dept;
System.out.println("ho gya jama:");

System.out.println(" ");
break;

case 3:

System.out.println("balance : "+balance);
System.out.println(" ");
break;

case 4:
 System.exit(0);

}
}
}
}











