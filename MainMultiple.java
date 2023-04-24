import java.util.Scanner;


class Multiple{
 int a;
 int b;
}

class MainMultiple
{
public static void main(String[]args)
{

 Scanner sky=new Scanner(System.in);

int a=sky.nextInt();


int b=sky.nextInt();


 if (b%a==0){
System.out.println("multiple");
}
else
{
System.out.println("Not a Multiple");
}
}
}
