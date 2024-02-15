package abstractFactory;

public class Abra extends Peon {
    
    public Abra() {
        setName("Abra");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.ceil(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 9);
    }
}