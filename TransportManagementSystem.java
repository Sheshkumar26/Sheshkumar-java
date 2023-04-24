import java.io.*;
import java.util.*;
import java.util.Scanner;

class Transportation {
    private String vehicleNumber;
    private String vehicleType;
    private int seatingCapacity;
    private int maxSpeed;
    private String route;

    public Vehicle(String vehicleNumber, String vehicleType, int seatingCapacity, int maxSpeed, String route) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.seatingCapacity = seatingCapacity;
        this.maxSpeed = maxSpeed;
        this.route = route;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber + ", Vehicle Type: " + vehicleType + ", Seating Capacity: " + seatingCapacity +
                ", Maximum Speed: " + maxSpeed + ", Route: " + route;
    }
}

class TransportSystem {
    private ArrayList<Vehicle> vehicles;

    public TransportSystem() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public ArrayList<Vehicle> searchVehicleByType(String vehicleType) {
        ArrayList<Vehicle> searchResults = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().equals(vehicleType)) {
                searchResults.add(vehicle);
            }
        }
        return searchResults;
    }
}

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
