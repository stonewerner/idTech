import java.util.Random;
import java.util.Scanner;

public class Arena {
    public static Random generator = new Random();
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        Character player1 = new Mage();
        Character player2 = new Rogue();
        //either of these could be "Character"


        System.out.println(player1.name + " vs. " + player2.name);
        System.out.println(player1.health + " vs. "  + player2.health);

        while (player1.isAlive() && player2.isAlive()) {
            int damage;

            System.out.println(player1.name + ": " + player1.health + " health remaining");
            System.out.println(player2.name + ": " + player2.health + " health remaining");

            System.out.println("You are " + player1.name);
            System.out.println("What would you like to do?");
            System.out.println("1: Attack with your strength\n2: Gamble for a special attack");
            int userChoice = userInput.nextInt();
            if (userChoice == 1)
            {
                damage = player1.attack(player2);
                System.out.println(player1.name + " hits " + player2.name + " for " + damage);

                damage = player2.attack(player1);
                System.out.println(player2.name + " hits " + player1.name + " for " + damage);
            }
            else
                {
                    damage = player1.specialAttack(player2);
                    System.out.println(player1.name + " hits " + player2.name + " for " + damage);

                    damage = player2.attack(player1);
                    System.out.println(player2.name + " hits " + player1.name + " for " + damage);
                }


        }
        if (player1.isAlive()){
            System.out.println(player1.name + " wins!!");
        }
        else if (player2.isAlive()){
            System.out.println(player2.name + " wins!!");
        }
        else
            {
                System.out.println("DRAW");
            }


    }
}
