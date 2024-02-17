package abstractFactory;

public class Machoke extends Peon {
    
    public Machoke() {
        setName("Machoke");
        setAttack(generateRandomStat() * 5);
        setDefense(generateRandomStat() * 5);
        setSpeed(generateRandomStat() * 5);
        setLuck((int) Math.ceil(generateRandomStat() * 2.5));
        setHitPoints(generateRandomStat() * 20);
        setHealth(getHitPoints());
    }
}