package abstractfactory; 

/*
 * Concrete class for the pokemon Voltorb.
 */
public class Voltorb extends Henchman {

    /*
     * initialize enemy with its stats.
     */
    public Voltorb() {
        setName("Voltorb");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat()));
        setHitPoints(generateRandomStat() * 6);
        setHealth(getHitPoints());
        setPotion(1);
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 10;
    }
}