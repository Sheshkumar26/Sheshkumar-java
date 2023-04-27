import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;





class Transport  {
    public String source;
    public String destination;
    public String modeOfTransport;
    public String distance;

    public Transport(String source, String destination, String modeOfTransport,String distance) {
        this.source = source;
        this.destination = destination;
        this.modeOfTransport = modeOfTransport;
        this.distance = distance;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getModeOfTransport() {
        return modeOfTransport;
    }

    public void setModeOfTransport(String modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}

class Admin {
    private ArrayList<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public ArrayList<Transport> getTransports() {
        return transports;
    }
}

public class TransportationSystem {


    public static void storeDataToFile(String fileName, String str1, String str2, String str3, String str4) {
        try {
            PrintWriter writer = new PrintWriter(new File(fileName));

            // Write the strings to the file separated by commas
            writer.println(str1 + "," + str2 + "," + str3 + "," + str4);

            writer.close();
            System.out.println("Data stored successfully in file " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error storing data to file " + fileName);
            e.printStackTrace();
        }
    }

    // Function to read data from a file and store it in a 2D array of strings
    public static String[][] readDataFromFile(String fileName) {
        String[][] data = new String[1][4]; // 2D array to store the data

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(","); // Split the line into an array of strings using commas as delimiters
                data[0] = parts;
            }

            scanner.close();
            System.out.println("Data read successfully from file " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error reading data from file " + fileName);
            e.printStackTrace();
        }

        return data;
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter 1 to add transport, 2 to view transports, or 3 to exit:");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    System.out.println("Enter source:");
                    String source = scanner.nextLine();

                    System.out.println("Enter destination:");
                    String destination = scanner.nextLine();

                    System.out.println("Enter mode of transport:");
                    String modeOfTransport = scanner.nextLine();

                    System.out.println("Enter distance in km:");
                    String distance = scanner.nextLine();

                   Transport transport = new Transport(source, destination, modeOfTransport, distance);
                    admin.addTransport(transport);
                    storeDataToFile("Transport.txt",source, destination, modeOfTransport, distance);

                } else if (choice == 2) {
                     readDataFromFile("Transport.txt");
                     ArrayList<Transport> transports = admin.getTransports();
                     for (Transport transport : transports) {
                         System.out.println("Source: " + transport.getSource());
                         System.out.println("Destination: " + transport.getDestination());
                         System.out.println("Mode of transport: " + transport.getModeOfTransport());
                         System.out.println("Distance: " + transport.getDistance() + " km");
                     }
                    
                    String[][] data = readDataFromFile("Transport.txt");
                        System.out.println("Source    Destination  transport  distance");
                    // Iterate through each row of the array
                    for (int i = 0; i < data.length; i++) {
                        // Iterate through each column of the row
                        for (int j = 0; j < data[i].length; j++) {
                            // Print out the element at the current row and column
                            System.out.print(data[i][j] + " ");
                        }
                        // Print a newline character to move to the next row
                        System.out.println();
                    }


                    


                } else if (choice == 3) {
                    break;
                } else {
                    throw new Exception("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
  
