package abstractFactory; 

public class Geodude extends Henchman{

    /*
     * initialize enemy with its stats.
     */
    public Geodude() {
        setName("Geodude");
        setAttack(generateRandomStat());
        setDefense(generateRandomStat());
        setSpeed(generateRandomStat());
        setLuck((int) Math.floor(generateRandomStat() / 2 ));
        setHitPoints(generateRandomStat() * 3);
        setHealth(getHitPoints());
        setPotion(1);
    }

    /*
     * provide experience for when enemy is defeated
     */
    public int getExperience() {
        return 5;
    }
}