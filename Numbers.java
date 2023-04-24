import java.util.*;

public class Numbers{

public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter the numbers of terms");

int n = sc.nextInt();

int sum = 0;

for(int i=1;i<=n;i++)
if((i%2) == 0)
 sum = sum + i;

System.out.println("print sum of all even numbers from 1 to "+n+"is:"+sum);
}
}


