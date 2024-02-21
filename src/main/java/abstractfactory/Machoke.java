package abstractfactory;

/*
 * Concrete class for the pokemon Machoke.
 */
public class Machoke extends Peon {

    /*
     * initialize enemy with its stats.
     */
    public Machoke() {
        setName("Machoke");
        setAttack(generateRandomStat() * 20);
        setDefense(generateRandomStat() * 20);
        setSpeed(generateRandomStat() * 15);
        setLuck((int) Math.ceil(generateRandomStat() * 2.5));
        setHitPoints(generateRandomStat() * 50);
        setHealth(getHitPoints());
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 20;
    }
}