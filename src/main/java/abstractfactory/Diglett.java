package abstractfactory;

/*
 * Concrete class for the pokemon Diglett.
 */
public class Diglett extends Peon {

    /*
     * initialize enemy with its stats.
     */
    public Diglett() {
        setName("Diglett");
        setAttack(generateRandomStat());
        setDefense(generateRandomStat());
        setSpeed(generateRandomStat());
        setLuck((int) Math.floor(generateRandomStat() * .5));
        setHitPoints(generateRandomStat() * 3);
        setHealth(getHitPoints());
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 1;
    }
}