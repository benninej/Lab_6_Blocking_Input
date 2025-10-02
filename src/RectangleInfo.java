import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter the length of the rectangle: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again.");
            }
        } while (!done);
        done = false; // Reset for next input

        do
        {
            System.out.println("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again.");
            }
        }while (!done);
        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt((length * length) + (width * width));

        System.out.printf("The area of the rectangle is: %.2f\n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f\n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f\n", diagonal);

    }
}
