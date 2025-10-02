import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int valC = 0;
        int valF = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enetr your C value: ");
            if (in.hasNextInt())
            {
                valC = in.nextInt();
                done = true;
            }
            else
            {
                trash = in.next();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again.");
            }
        } while (!done);
        valF = (int) ((9.0 / 5.0) * valC + 32);
        System.out.println("F value is: " + valF);
    }
}
