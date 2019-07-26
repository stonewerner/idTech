public class CheckInventory {
    public static void main(String[] args) {
        String[] inventory = new String[5];
        inventory[0] = "HP Potion";
        inventory[1] = "Magic Sword";
        inventory[2] = "Wooden Shield";
        printInventory(inventory);
        if (checkInventory(inventory, "Magic Sword"))
        {
            System.out.println("You have the Magic Sword. Steeze.");
        }
        else
            {
                System.out.println("You don't even have the Magic Sword, loser.");

            }
        checkSpaces(inventory);
    }

    public static boolean checkInventory(String[] inventory, String toCheck){
        for(int i = 0; i< inventory.length; i++){
            String item = inventory[i];
            if (item != null && item.equals(toCheck)){
                return true;
            }
        }
        return false;
    }

    public static void checkSpaces(String[] inventory){
        int nullindex = 0;
        for (int i = 0; i < inventory.length; i++){
            String item = inventory[i];
            if (item == null){
                nullindex++;
            }

        }
        System.out.println("You have " + nullindex + " empty inventory spaces.");

    }

    public static void printInventory(String[] inventory){
        for(int i = 0;i < inventory.length;i++){
            System.out.println(inventory[i]);

        }


    }

}
