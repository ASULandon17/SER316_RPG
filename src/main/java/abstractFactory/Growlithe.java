package abstractFactory;

public class Growlithe extends Peon {
    
    public Growlithe() {
        setName("Growlithe");
        setAttack(generateRandomStat() * 8);
        setDefense(generateRandomStat() * 8);
        setSpeed(generateRandomStat() * 8);
        setLuck((int) Math.ceil(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 18);
        setHealth(getHitPoints());
    }
    
    public int getExperience() {
        return 15;
    }
}