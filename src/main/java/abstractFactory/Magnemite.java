package abstractFactory;

/*
 * Concrete class for the pokemon Magnemite.
 */
public class Magnemite extends Peon {

    /*
     * initialize enemy with its stats.
     */
    public Magnemite() {
        setName("Magnemite");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat()));
        setHitPoints(generateRandomStat() * 6);
        setHealth(getHitPoints());
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 5;
    }
}