import java.util.Scanner;

public class CharacterCreator {
    public static void main(String[] args) {
        Scanner playerInput;
        playerInput = new Scanner(System.in);
        double playerHealth;
        String playerName;
        System.out.println("What is your character's name?");
        playerName = playerInput.nextLine();
        System.out.println("Welcome " + playerName);
        System.out.println("How much health does " + playerName + " have?");
        playerHealth = playerInput.nextDouble();
        System.out.println(playerName + " has " + playerHealth + " health");

        //madlibs!!
        Scanner newlib;
        newlib = new Scanner(System.in);
        String verb1;
        String noun1;
        String adj1;
        System.out.println("Verb");
        verb1 = newlib.nextLine();
        System.out.println("Adjective");
        adj1 = newlib.nextLine();
        System.out.println("Noun");
        noun1 = newlib.nextLine();
        System.out.println("Because you love to " + verb1 + ", I think you are a " + adj1 + " " + noun1);


    }
}
