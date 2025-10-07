import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number = (int)(Math.random() * 10) + 1; //
        int guess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();

                if (guess < 1 || guess > 10)
                {
                    System.out.println("Your guess is out of range. Try again.");
                }
                else if (guess < number)
                {
                    System.out.println("The number was " + number + ". Your guess is too low.");
                    done = true;
                }
                else if (guess > number)
                {
                    System.out.println("The number was " + number + ". Your guess is too high.");
                    done = true;
                }
                else
                {
                    System.out.println("Congratulations! You guessed the number " + number);
                    done = true;
                }

            }
            else
            {
                trash = in.nextLine(); // clear the buffer
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again.");
            }
        } while (!done);
    }
}
