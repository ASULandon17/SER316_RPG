package abstractFactory;

public class Diglett extends Peon {
    
    public Diglett() {
        setName("Diglett");
        setAttack(generateRandomStat());
        setDefense(generateRandomStat());
        setSpeed(generateRandomStat());
        setLuck((int) Math.floor(generateRandomStat() / 2 ));
        setHitPoints(generateRandomStat() * 3);
    }
}