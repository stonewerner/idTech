import java.util.Random;

public class MonsterGenerator {
    public static void main(String[] args) {
        Random generator = new Random();
        String monster;
        String[] monsters = {"Ghost", "Goblin", "Ghoul", "Casper"};
        int monsterindex = generator.nextInt(monsters.length);
        monster = monsters[monsterindex];
        monsters[1] = "Fool";

        String[] adjs = {"Fast", "Stupid Thicc", "Steezy"};
        String adj;
        int adjindex = generator.nextInt(adjs.length);
        adj = adjs[adjindex];

        System.out.println(monsters[0]);
        System.out.println(monsters[1]);
        System.out.println(monsters[2]);
        System.out.println(monsters[3]);

        System.out.println("There are " + monsters.length + " monsters in the array");
        System.out.println("The last element is " + monsters[monsters.length-1]);

        System.out.println("A " + adj + " " + monster + " appears!");
    }
}
