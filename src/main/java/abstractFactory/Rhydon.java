package abstractFactory; 

/*
 * Concrete class for the pokemon Rhydon.
 */
public class Rhydon extends Henchman{

    /*
     * initialize enemy with its stats.
     */
    public Rhydon() {
        setName("Rhydon");
        setAttack(generateRandomStat() * 16);
        setDefense(generateRandomStat() * 18);
        setSpeed(generateRandomStat() * 10);
        setLuck((int) Math.floor(generateRandomStat() * 2.5));
        setHitPoints(generateRandomStat() * 44);
        setHealth(getHitPoints());
        setPotion(2);
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 80;
    }
}