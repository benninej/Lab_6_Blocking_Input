import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celcius = 0.0;
        double fahrenheit = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter temp in celcius: ");
            if (in.hasNextDouble())
            {
                celcius = in.nextDouble();
                fahrenheit = (celcius * 9/5) + 32;
                System.out.printf("The temp in fahrenheit: %.2f\n", fahrenheit);
                done = true;
            }
            else
            {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again.");
            }
        } while (!done);
    }
}
