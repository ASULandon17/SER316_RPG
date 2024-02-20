package abstractFactory;

public class Magnemite extends Peon {
    
    public Magnemite() {
        setName("Magnemite");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat()));
        setHitPoints(generateRandomStat() * 6);
        setHealth(getHitPoints());
    }
    
    public int getExperience() {
        return 5;
    }
}