package abstractFactory; 

/*
 * Concrete class for the pokemon Onix.
 */
public class Onix extends Boss{

    /*
     * initialize enemy with its stats.
     */
    public Onix() {
        setName("Onix");
        setAttack(generateRandomStat());
        setDefense(generateRandomStat());
        setSpeed(generateRandomStat());
        setLuck((int) Math.floor(generateRandomStat() / 2 ));
        setHitPoints(generateRandomStat() * 3);
        setPowerPoints(generateRandomStat());
        setHealth(getHitPoints());
        setMana(getPowerPoints());
        setPotion(1);
    }

    /*
     * create special attack because enemy is a boss.
     */
    public int useSpecialAttack() {
        //check if enough PP is available
        if (getPowerPoints() < 3) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Onix used Slam!");
        //decrement PP
        setMana(getMana() - 4);
        //get damage from a regular attack
        int damage = useAttack();
        //multiply by 1.5 because it's the special attack
        return (int) Math.floor(damage * 1.4);
    }

    /*
     * create logic for taking a turn in battle.
     */
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        } else if (Math.random() < .05) {
            System.out.println("Onix missed!");
            return 0;
        //use sp.attack ~33% of the time if enough mana 
        } else if ((getMana() > 4) && (Math.random() <= 0.2)) {
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
        return 10;
    }
}