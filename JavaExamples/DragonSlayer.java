public class DragonSlayer {
    public static void main(String[] args) {
        int playerStrength = 40;
        int dragonHP = 70;
        boolean hasSword = true;
        if (playerStrength >= dragonHP)
        {
            System.out.println("You rekt the dragon!!");
        }
        else if (hasSword)
        {
            if ((dragonHP - playerStrength) <= 10)
            {
                System.out.println("You can't beat the Dragon with your strength, but you can use your sword!");

            }
            else
                {
                System.out.println("Even though you have your sword, the Dragon is too strong for you and eats you for breakfast");
            }



        }
        else
            {
            System.out.println("The Dragon rekt you!");
        }
    }
}
