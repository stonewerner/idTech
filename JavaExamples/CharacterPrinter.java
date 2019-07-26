public class CharacterPrinter {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int level = 3;
        double health = 150;
        String name = "Tracer";
        int UltCharge = 26;

        System.out.println("Character Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Ult Charge: " + UltCharge);
        UltCharge = UltCharge * 3;
        System.out.println(UltCharge);
    }
}
