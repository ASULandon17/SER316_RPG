package abstractFactory; 

public class Arcanine extends Boss{
    
    public Arcanine() {
        setName("Arcanine");
        setAttack(generateRandomStat() * 4);
        setDefense(generateRandomStat() * 4);
        setSpeed(generateRandomStat() * 4);
        setLuck((int) Math.floor(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 14);
        setPowerPoints(generateRandomStat() * 4);
        setHealth(getHitPoints());
        setMana(getPowerPoints());
        setPotion(1);
    }
    
    public int useSpecialAttack() {
        System.out.println("Arcanine used Flamethrower!");
        //decrement PP
        setPowerPoints(getPowerPoints() - 5);
        //get damage from a regular attack
        int damage = useAttack();
        //give bonus damage because it's the special attack
        return (int) Math.ceil(damage * 1.7);
    }
    
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        } else if (Math.random() < .05) {
            System.out.println("Arcanine missed!");
            return 0;
        //use sp.attack ~33% of the time if enough mana 
        } else if ((getMana() >= 5) && (Math.random() > 0.33)) {
            return useSpecialAttack();
        //otherwise just attack
        } else {
            return useAttack();
        }
    }
    
    public int getExperience() {
        return 80;
    }
}