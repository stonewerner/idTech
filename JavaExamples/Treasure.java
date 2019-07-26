import java.util.Random;

public class Treasure {
    public static void main(String[] args) {
        Random generator = new Random();
        int gold;
        boolean chest;
        double skeletons;
        chest = generator.nextBoolean();
        if (chest==true)
        {
            gold = generator.nextInt(5) + 10;
            System.out.println("You found " + gold + " gold in the chest!");
        }
        else
            {
                skeletons = generator.nextDouble()*100;
                System.out.println("You didn't find any gold, but you found " + skeletons + " skeletons!!!");
        }



    }
}
