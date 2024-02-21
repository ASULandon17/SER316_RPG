package abstractfactory; 

/*
 * Concrete class for the pokemon Kadabra.
 */
public class Kadabra extends Henchman {

    /*
     * initialize enemy with its stats.
     */
    public Kadabra() {
        setName("Kadabra");
        setAttack(generateRandomStat() * 6);
        setDefense(generateRandomStat() * 5);
        setSpeed(generateRandomStat() * 8);
        setLuck((int) Math.floor(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 12);
        setHealth(getHitPoints());
        setPotion(1);
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 20;
    }
}