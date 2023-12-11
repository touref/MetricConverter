import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        do {
            double meters;

            // Get the measurement in meters
            System.out.print("Enter the measurement in meters: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine(); // Consume invalid input
            }
            meters = scanner.nextDouble();

            // Calculate and display the measurement in miles, feet, and inches
            double miles = meters * 0.000621371;
            double feet = meters * 3.28084;
            double inches = meters * 39.3701;

            System.out.println("Measurement in miles: " + miles);
            System.out.println("Measurement in feet: " + feet);
            System.out.println("Measurement in inches: " + inches);

            // Ask if the user wants to convert again
            System.out.print("Do you want to convert another measurement? (Y/N): ");
            String input = scanner.next();
            done = !input.equalsIgnoreCase("Y");

        } while (!done);

        System.out.println("Program terminated. Thanks for using the Measurement Converter!");
        scanner.close();
    }
}