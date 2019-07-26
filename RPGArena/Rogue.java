public class Rogue extends Character {
    public int dexterity = 17;

    public Rogue(){
        super();
        this.name = "Rogue";
        //this.strength = 8;
        //this.defense = 4;
        //this.health = 100;
    }

    public int specialAttack(Character target){

        boolean criticalHit = Arena.generator.nextInt(100) < dexterity;
        int damage = this.strength;
        if (criticalHit)
        {
            damage*=3.5;
            System.out.println("THE ROGUE LANDS A CRITICAL HIT");
        }
        int damageDealt = target.takeDamage(damage);
        return damageDealt;
    }

}
