package abstractfactory; 

/*
 * Concrete class for the pokemon Nidoking.
 */
public class Nidoking extends Boss {
    
    /*
     * initialize enemy with its stats.
     */
    public Nidoking() {
        setName("Nidoking");
        setAttack(generateRandomStat() * 12);
        setDefense(generateRandomStat() * 22);
        setSpeed(generateRandomStat() * 14);
        setLuck((int) Math.floor(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 40);
        setPowerPoints(generateRandomStat() * 2);
        setHealth(getHitPoints());
        setMana(getPowerPoints());
        setPotion(2);
    }
    
    /*
     * create special attack because enemy is a boss.
     */
    public int useSpecialAttack() {
        //check if enough PP is available
        if (getMana() < 6) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Nidoking used Earthquake!");
        //decrement PP
        setMana(getMana() - 6);
        //get damage from a regular attack
        int damage = useAttack();
        
        //calculate additional damage based on luck
        int luck = getLuck() > 100 ? 100 : getLuck(); //Max luck == 100
        double damageMultiplier = ((Math.random() * (100 - luck)) + luck)
                + ((Math.random() * (100 - luck)) + luck);
        
        damage = (int) Math.floor(damage * (.01 * damageMultiplier));
        String message = damageMultiplier <= 100 
            ? (Math.ceil(damageMultiplier / 23) + " on the Richter scale!") : 
            (Math.ceil(damageMultiplier / 23) + " on the Richter scale! It's a world destroyer!");
        System.out.println(message);
        return damage;
    }
    
    /*
     * create logic for taking a turn in battle.
     */
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        //use sp.attack ~33% of the time if enough mana 
        } else if (Math.random() <= .05) {
            System.out.println("Nidoking missed!\n");
            return 0;
        } else if ((getMana() >= 6) && (Math.random() <= 0.20)) {
            return useSpecialAttack();
        //otherwise just attack
        } else {
            return useAttack();
        }
    }
    
    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 160;
    }
}