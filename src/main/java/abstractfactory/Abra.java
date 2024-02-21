package abstractfactory;

/*
 * Concrete class for the pokemon Abra
 */
public class Abra extends Peon {

    /**
     * initialize enemy with its stats.
     */
    public Abra() {
        setName("Abra");
        setAttack(generateRandomStat() * 6);
        setDefense(generateRandomStat() * 4);
        setSpeed(generateRandomStat() * 6);
        setLuck((int) Math.ceil(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 12);
        setHealth(getHitPoints());
    }

    /**
     * provides experience for when enemy is defeated.
     */
    public int getExperience() {
        return 10;
    }
}