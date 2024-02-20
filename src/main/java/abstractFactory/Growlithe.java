package abstractFactory;

/*
 * Concrete class for the pokemon Growlithe.
 */
public class Growlithe extends Peon {

    /*
     * initialize enemy with its stats.
     */
    public Growlithe() {
        setName("Growlithe");
        setAttack(generateRandomStat() * 8);
        setDefense(generateRandomStat() * 8);
        setSpeed(generateRandomStat() * 8);
        setLuck((int) Math.ceil(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 18);
        setHealth(getHitPoints());
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 15;
    }
}