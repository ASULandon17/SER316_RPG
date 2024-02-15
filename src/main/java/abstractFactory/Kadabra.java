package abstractFactory; 

public class Kadabra extends Henchman{
    
    public Kadabra() {
        setName("Kadabra");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 9);
        setPotion(1);
    }
}