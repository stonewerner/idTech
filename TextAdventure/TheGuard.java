import java.util.Scanner;

public class TheGuard {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
        int playerClass = userInput.nextInt();

        System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - Steal his wallet\n3 - Throw a fireball\n4 - Talk the guard into leaving\n5 - Bond with the guard over your shared disdain for magic");
        int playerChoice = userInput.nextInt();

        if ((playerChoice==1 && playerClass==1) || (playerClass==3 && playerChoice==3))
        {
            System.out.println("You absolutely destroy the guard.");
        }
        else if (playerClass==2 && playerChoice==2)
        {
            System.out.println("You steal his wallet, easy money.");
        }
        else if (playerClass!=3 && playerChoice==5)
        {
            System.out.println("The guard totally feels that.");

        }
        else
            {
                System.out.println("That really didn't work");
                System.out.println("The guard follows his training and punches you in the gut");


            }


        userInput.close();
    }

}