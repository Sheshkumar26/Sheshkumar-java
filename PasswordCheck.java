import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

       
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            
            if (password.length() < 8) {
                throw new ArithmeticException("Password must be at least 8 characters long.");
            }

       
            boolean containsNumber = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    containsNumber = true;
                    break;
                }
            }
            if (!containsNumber) {
                throw new Exception("Password must contain at least one number.");
            }

        
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Password validation successful!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}