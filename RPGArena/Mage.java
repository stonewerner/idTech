public class Mage extends Character {
    public int Mana = 50;

    public Mage() {
        super();
        this.name = "Mage";
    }

    public int specialAttack(Character target){

        boolean criticalHit = Arena.generator.nextInt(100) < Mana;
        int damage = this.strength;
        if (criticalHit)
        {
            damage+=36;
            System.out.println("THE MAGE CASTS A FIREBALL");
        }
        int damageDealt = target.takeDamage(damage);
        return damageDealt;
    }




}
