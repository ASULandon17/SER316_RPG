package abstractFactory;

public class Magnemite extends Peon {
    
    public Magnemite() {
        setName("Magnemite");
        setAttack(generateRandomStat() * 2);
        setDefense(generateRandomStat() * 2);
        setSpeed(generateRandomStat() * 2);
        setLuck((int) Math.floor(generateRandomStat()));
        setHitPoints(generateRandomStat() * 5);
        setHealth(getHitPoints());
    }
    
    public int getExperience() {
        return 5;
    }
}