package abstractfactory; 

/*
 * Concrete class for the pokemon Arcanine.
 */
public class Arcanine extends Boss {

    /*
     * initialize enemy with its stats.
     */
    public Arcanine() {
        setName("Arcanine");
        setAttack(generateRandomStat() * 10);
        setDefense(generateRandomStat() * 7);
        setSpeed(generateRandomStat() * 12);
        setLuck((int) Math.floor(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 18);
        setPowerPoints(generateRandomStat() * 2);
        setHealth(getHitPoints());
        setMana(getPowerPoints());
        setPotion(1);
    }

    /*
     * create special attack because enemy is a boss.
     */
    public int useSpecialAttack() {
      //check if enough PP is available
        if (getMana() < 5) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Arcanine used Flamethrower!");
        //decrement PP
        setMana(getMana() - 5);
        //get damage from a regular attack
        int damage = useAttack();
        //give bonus damage because it's the special attack
        return (int) Math.ceil(damage * 1.4);
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
            System.out.println("Arcanine missed!");
            return 0;
        //use sp.attack ~33% of the time if enough mana 
        } else if ((getMana() >= 5) && (Math.random() < 0.2)) {
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
        return 80;
    }
}