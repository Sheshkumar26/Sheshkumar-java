import java.util.Scanner;

class TransportationSystem {
    private int availableSeats;
    private String departure;
    private String destination;
    
    public TransportationSystem(int availableSeats, String departure, String destination) {
        this.availableSeats = availableSeats;
        this.departure = departure;
        this.destination = destination;
    }
    
    public void bookTicket(int numTickets) throws Exception {
        if (numTickets > availableSeats) {
            throw new Exception("Not enough available seats!");
        } else {
            availableSeats -= numTickets;
            System.out.println(numTickets + " ticket(s) booked successfully.");
        }
    }
    
    public String getDeparture() {
        return departure;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public int getAvailableSeats() {
        return availableSeats;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        TransportationSystem transportation = new TransportationSystem(50, "Los Angeles", "New York");
        
        System.out.println("Welcome to our Transportation System!");
        System.out.println("Departure: " + transportation.getDeparture());
        System.out.println("Destination: " + transportation.getDestination());
        
        while (true) {
            System.out.println("Enter the number of tickets you want to book: ");
            int numTickets = input.nextInt();
            
            try {
                transportation.bookTicket(numTickets);
                System.out.println("Available seats: " + transportation.getAvailableSeats());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}