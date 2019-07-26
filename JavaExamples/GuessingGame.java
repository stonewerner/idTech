import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        Random randint = new Random();
        int guess;
        int target;
        target = randint.nextInt(100) + 1;
        System.out.println("Guess a number between 1 and 100");
        guess = getInput.nextInt();
        if (guess==target)
        {
            System.out.println("Good job, you got it!");
        }
        while (guess!=target)
        {
            if (guess<target)
                {
                System.out.println(guess + " is too low!");
                }
            else
                {
                System.out.println(guess + " is too high");
                }
            System.out.println("Guess a number between 1 and 100");
            guess = getInput.nextInt();
            if (guess==target)
            {
                System.out.println("Good job, you got it!");
            }
        }


    }
}
