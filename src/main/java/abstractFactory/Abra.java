package abstractFactory;

public class Abra extends Peon {
    
    public Abra() {
        setName("Abra");
        setAttack(generateRandomStat() * 6);
        setDefense(generateRandomStat() * 4);
        setSpeed(generateRandomStat() * 6);
        setLuck((int) Math.ceil(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 12);
        setHealth(getHitPoints());
    }
    
    public int getExperience() {
        return 10;
    }
}