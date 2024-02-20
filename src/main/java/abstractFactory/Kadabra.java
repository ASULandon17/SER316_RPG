package abstractFactory; 

public class Kadabra extends Henchman{
    
    public Kadabra() {
        setName("Kadabra");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 9);
        setHealth(getHitPoints());
        setPotion(1);
    }
    
    public int getExperience() {
        return 20;
    }
}