package abstractfactory; 

/*
 * Concrete class for the pokemon Rapidash.
 */
public class Rapidash extends Henchman {

    /*
     * initialize enemy with its stats.
     */
    public Rapidash() {
        setName("Rapidash");
        setAttack(generateRandomStat() * 9);
        setDefense(generateRandomStat() * 7);
        setSpeed(generateRandomStat() * 14);
        setLuck((int) Math.floor(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 17);
        setHealth(getHitPoints());
        setPotion(1);
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 40;
    }
}