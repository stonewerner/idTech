public class Character {

    public String name;
    public int strength;
    public int health;
    public int defense;

    public int takeDamage(int damage){

        int damageTaken = damage - this.defense;
        this.health -= damageTaken;
        return damageTaken;
    }

    public int attack(Character target){

        int damage = this.strength*2;
        int damageDealt = target.takeDamage(damage);
        return damageDealt;
    }

    public int specialAttack(Character target){

        int damage = this.strength;
        int damageDealt = target.takeDamage(damage);
        return damageDealt;
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public static String[] nameList = {"Geoff", "Steve", "Krogar", "Thicc Boi", "Bicc Boi", "Steeze Man69"};

    public Character(){ //CONSTRUCTOR

        this.name = nameList[Arena.generator.nextInt(nameList.length)];
        this.strength = Arena.generator.nextInt(12)+1;
        this.defense = Arena.generator.nextInt(12)+1;
        this.health = Arena.generator.nextInt(100)+1;
    }

    //public Character(int str, int def, int health){
     //   this();
     //   this.strength = str;
     //   this.defense = def;
     //   this.health = health;
    //}
}

