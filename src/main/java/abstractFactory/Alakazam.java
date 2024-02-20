package abstractFactory; 

/*
 * Concrete class for the pokemon Alakazam.
 */
public class Alakazam extends Boss{
    
    /*
     * initialize enemy with its stats.
     */
    public Alakazam() {
        setName("Alakazam");
        setAttack(generateRandomStat() * 6);
        setDefense(generateRandomStat() * 5);
        setSpeed(generateRandomStat() * 8);
        setLuck((int) Math.floor(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 12);
        setHealth(getHitPoints());
        setPowerPoints(generateRandomStat() * 2);
        setMana(getPowerPoints());
        setPotion(1);
    }
    
    /**
     * creates special attack because enemy is a boss.
     */
    public int useSpecialAttack() {
        System.out.println("Alakazam used Psychic!");
        //decrement PP
        setMana(getMana() - 5);
        //get damage from a regular attack
        int damage = useAttack();
        //give bonus damage because it's the special attack
        return (int) Math.ceil(damage * 1.6);
    }
    
    /**
     * creates logic for taking a turn in battle.
     */
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        } else if (Math.random() < .05) {
            System.out.println("Alakazam missed!");
            return 0;
        //use sp.attack ~33% of the time if enough mana 
        } else if ((getMana() >= 5) && (Math.random() <= 0.2)) {
            return useSpecialAttack();
        //otherwise just attack
        } else {
            return useAttack();
        }
    }
    
    /**
     * provides experience for when enemy is defeated
     */
    public int getExperience() {
        return 40;
    }
}