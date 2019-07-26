import java.util.Scanner;
import java.util.Random;



public class Adventure {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randomGenerator = new Random();
        int playerLevel = 1;
        String playerName = "Big Boy";
        double playerHealth = 10;
        boolean hasSword = false;

        int playerChoice;
        System.out.println("What is your hero's name?");
        playerName = userInput.nextLine();
        System.out.println("Welcome " + playerName + ".");
        System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");

        System.out.println("1: Enter the Cave of Wonders");
        System.out.println("2: Run away because you're bad");
        playerChoice = userInput.nextInt();
        if (playerChoice==2)
        {
         System.out.println(playerName + " runs away. Not very heroic.");
         System.out.println("GAME OVER");
         System.exit(0);
        }
        else
            {
                System.out.println(playerName + " enters the Cave of Wonders!");
                System.out.println("You make it to the entrance of the cave.");
                playerLevel++;
                System.out.println("LEVEL UP");
                System.out.println("You are now level " + playerLevel);

                System.out.println("You travel forward into the dark cave. You feel something press against your leg...");
                System.out.println("It's a trap! Suddenly, you're being bombarded by rocks from above.");

                int rockDamage;
                rockDamage = randomGenerator.nextInt(5);
                playerHealth -= rockDamage;
                if (rockDamage==0)
                {
                 System.out.println("Wow nice, you dodged the rocks and took no damage.");
                }
                else
                    {
                        System.out.println("The rock slide hits you for " + rockDamage + " HP!");
                    }
                System.out.println("You have " + playerHealth + " HP remaining.");

                System.out.println("The cave narrows as you press on until you manage to squeeze through an opening into a large natural cavern.");
                System.out.println("Before you is a treasure chest.");
                System.out.println("1: Open the chest");
                System.out.println("2: Ignore the chest; it is obviously trapped");
                playerChoice = userInput.nextInt();
                if (playerChoice==1)
                {
                 System.out.println("You slowly pry open the chest to reveal a magical sword!");
                 hasSword = true;
                }
                else
                    {
                        System.out.println("You ignore the chest and move on.");
                    }

                System.out.println("You leave the large cavern.");
                System.out.println("Peeking around a corner you see the dragon that sleeps in the room ahead.");
                System.out.println("As you turn to leave, your foot kicks a rock. The loud thud wakes the dragon.");
                System.out.println("1: Fight the dragon");
                System.out.println("2: Run for your life");
                playerChoice = userInput.nextInt();
                if (playerChoice==1)
                {
                    System.out.println("You charge the dragon!");
                    if (hasSword==true)
                    {
                        System.out.println("You draw the magic sword and thrust it into the dragon, slaying the beast.");
                        playerLevel++;
                        System.out.println("LEVEL UP");
                        System.out.println("You are now level " + playerLevel);
                    }
                    else
                        {
                            System.out.println("The dragon eats you for breakfast.");
                            System.out.println("GAME OVER");
                            System.exit(0);

                        }

                }
                else
                    {
                        System.out.println(playerName + " runs away. Not very heroic.");
                        System.out.println("GAME OVER");
                        System.exit(0);

                    }

            }


    }
}
