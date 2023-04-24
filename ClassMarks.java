import java.util.Scanner;

class Marks{
int aboveAverage;
int belowAverage;
}

public class ClassMarks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] marks = new double[50];
        double totalMarks = 0;

        
        for (int i = 0; i < 50; i++) {
            System.out.print("Enter the marks  " + (i+1) + ": ");
            marks[i] = input.nextDouble();
            totalMarks += marks[i];
        }

        
        double averageMarks = totalMarks / 50;

       
        System.out.println("The average marks : " + averageMarks);

        
        int aboveAverage = 0;
        int belowAverage = 0;
        for (int i = 0; i < 50; i++) {
            if (marks[i] > averageMarks) {
                aboveAverage++;
            } else if (marks[i] < averageMarks) {
                belowAverage++;
            }
        }
 
        System.out.println("student whihch has above: " + aboveAverage);
        System.out.println("student which has below: " + belowAverage);
    }
}
