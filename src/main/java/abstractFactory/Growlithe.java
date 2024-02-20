package abstractFactory;

public class Growlithe extends Peon {
    
    public Growlithe() {
        setName("Growlithe");
        setAttack(generateRandomStat() * 4);
        setDefense(generateRandomStat() * 4);
        setSpeed(generateRandomStat() * 4);
        setLuck((int) Math.ceil(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 14);
        setHealth(getHitPoints());
    }
    
    public int getExperience() {
        return 15;
    }
}