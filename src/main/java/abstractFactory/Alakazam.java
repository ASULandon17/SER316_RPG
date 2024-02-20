package abstractFactory; 

public class Alakazam extends Boss{
    
    public Alakazam() {
        setName("Alakazam");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 9);
        setHealth(getHitPoints());
        setPowerPoints(generateRandomStat() * 3);
        setMana(getPowerPoints());
        setPotion(1);
    }
    
    public int useSpecialAttack() {
        System.out.println("Alakazam used Psychic!");
        //decrement PP
        setPowerPoints(getPowerPoints() - 5);
        //get damage from a regular attack
        int damage = useAttack();
        //give bonus damage because it's the special attack
        return (int) Math.ceil(damage * 1.6);
    }
    
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        } else if (Math.random() < .05) {
            System.out.println("Alakazam missed!");
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
        return 40;
    }
}