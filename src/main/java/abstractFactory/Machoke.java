package abstractFactory;

public class Machoke extends Peon {
    
    public Machoke() {
        setName("Machoke");
        setAttack(generateRandomStat() * 20);
        setDefense(generateRandomStat() * 20);
        setSpeed(generateRandomStat() * 15);
        setLuck((int) Math.ceil(generateRandomStat() * 2.5));
        setHitPoints(generateRandomStat() * 50);
        setHealth(getHitPoints());
    }
    
    public int getExperience() {
        return 20;
    }
}