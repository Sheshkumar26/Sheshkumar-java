  import java.util.Scanner;

class Positive 

public static void main(String[]args) {
   
        Scanner obj = new Scanner (System.in);
      int val1;
      int val2;

        System.out.println("Enter the value1:");
        
       val1= obj.nextInt();

System.out.println("Enter the value2:");
       val2= obj.nextInt();
        
        if ((val1=>1)&&(val2=>1)){
            
        System.out.println('_');
            
        }
        
        else {
            
            System.out.println("Invalid input");
        }
    }
}