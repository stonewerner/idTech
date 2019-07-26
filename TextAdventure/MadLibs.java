import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String adjective = getUserInput("Enter an adjective: ", userInput);
        String noun = getUserInput("Enter a noun: ", userInput);
        String animal = getUserInput("Enter an animal: ", userInput);
        String noise = getUserInput("Enter a noise: ", userInput);

        intro();
        printMadLib(adjective, noun, animal, noise);

        String color = getStats("Favorite Color: ", userInput);
        System.out.print("Your favorite color is " + color);

    }

    public static void intro(){
        System.out.println("Welcome to MadLibs!");


    }

    public static void printMadLib(String adjective, String noun, String animal, String noise){

        System.out.println(adjective + " Macdonald had a " + noun + ", E-I-E-I-O");
        System.out.println("and on that " + noun + " he had a " + animal + ", E-I-E-I-O");
        System.out.println("with a " + noise + " " + noise + " here");
        System.out.println("and a " + noise + " " + noise + " there,");
        System.out.println("here a " + noise + ", there a " + noise + ",");
        System.out.println("everywhere a " + noise + " " + noise + ",");
        System.out.println(adjective + " Macdonald had a " + noun + ", E-I-E-I-O.");

    }

    public static String getUserInput(String message, Scanner userInput){
        System.out.print(message);
        return userInput.nextLine();


    }

    public static String getStats(String message, Scanner userInput){
        System.out.print(message);
        return userInput.nextLine();

    }


}
