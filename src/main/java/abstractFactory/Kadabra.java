package abstractFactory; 

public class Kadabra extends Henchman{
    
    public Kadabra() {
        setName("Kadabra");
        setAttack(generateRandomStat() * 6);
        setDefense(generateRandomStat() * 5);
        setSpeed(generateRandomStat() * 8);
        setLuck((int) Math.floor(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 12);
        setHealth(getHitPoints());
        setPotion(1);
    }
    
    public int getExperience() {
        return 20;
    }
}