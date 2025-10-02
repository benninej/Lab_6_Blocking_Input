import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasInTank = 0.0;
        double mpg = 0.0;
        double gasPrice = 0.0;
        double DISTANCE = 100.0; // miles
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter the number of gallons of gas of in tank: ");
            if (in.hasNextDouble()) {
                gasInTank = in.nextDouble();
                done = true;
            } else {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again.");
            }
        } while (!done);
        done = false; // Reset for next input

        do {
            System.out.println("Enter the miles per gallon of your vehicle: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                done = true;
            } else {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again.");
            }
        } while (!done);
        done = false; // Reset for next input

        do {
            System.out.println("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                done = true;
            } else {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again.");
            }
        } while (!done);

        double costFor100Miles = (DISTANCE / mpg) * gasPrice;
        double maxDistance = gasInTank * mpg;

        System.out.printf("The cost to drive %.0f miles is $%.2f\n", DISTANCE, costFor100Miles);
        System.out.printf("The maximum distance you can drive with %.2f gallons of gas is %.2f miles\n", gasInTank, maxDistance);
    }
}
