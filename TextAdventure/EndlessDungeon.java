import java.util.Random;


public class EndlessDungeon {
    public static void main(String[] args) {
        Random generator = new Random();
        int playerHealth, enemyHealth;
        playerHealth=100;
        enemyHealth = generator.nextInt(10)+1;
        int playerDamage, enemyDamage, money;
        int enemiesDefeated = 0;

        System.out.println("You start to fight the fool in front of you");
        while (playerHealth > 0)
        {
            if (enemyHealth <=0)
            {
                System.out.println("You merked him!");
                enemiesDefeated++;
                System.out.println("Here comes the next fool");
                System.out.println("He has a random amount of health from 1 to 10");
                enemyHealth = generator.nextInt(10)+1;
                System.out.println("You start to fight the fool in front of you");

            }
            System.out.println("You better kill this fool\nYou have " + playerHealth + " health");
            playerDamage = generator.nextInt(5)+1;
            enemyDamage = generator.nextInt(3)+1;
            playerHealth -= enemyDamage;
            enemyHealth -= playerDamage;
            System.out.println("You attack the enemy for " + playerDamage);
            System.out.println("The enemy attacks you for " + enemyDamage);


        }
        System.out.println("GAME OVER\nYou merked " + enemiesDefeated + " fools");
        System.out.println("Test Your Luck!");
        money = generator.nextInt(101);
        System.out.println("You get " + money + " gold!");
        System.exit(0);


    }
}
