import java.util.Scanner;

class Transport
{
String name;
String Source location;
String Destination location;
int age;
String time;
String Seat type;


public class TransportEnquirySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Transport Enquiry System!");
        System.out.println("Please select the type of transportation: ");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Airplane");
        int transportType = scanner.nextInt();

        System.out.println("Enter the source location: ");
        String source = scanner.next();

        System.out.println("Enter the destination location: ");
        String destination = scanner.next();

        System.out.println("Enter the travel date (dd-mm-yyyy): ");
        String travelDate = scanner.next();

        System.out.println("Enter the travel time (hh:mm): ");
        String travelTime = scanner.next();

        // Find available routes
        // ...

        // Display routes and prices to the user
        // ...

        System.out.println("Select a route: ");
        int routeId = scanner.nextInt();

        System.out.println("Enter the number of seats: ");
        int numSeats = scanner.nextInt();

        // Book tickets
        // ...

        // Display ticket
        // ...

        System.out.println("Thank you for using the Transport Enquiry System!");
    }
}
