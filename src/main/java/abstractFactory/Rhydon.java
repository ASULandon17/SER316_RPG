package abstractFactory; 

public class Rhydon extends Henchman{
    
    public Rhydon() {
        setName("Rhydon");
        setAttack(generateRandomStat() * 16);
        setDefense(generateRandomStat() * 18);
        setSpeed(generateRandomStat() * 10);
        setLuck((int) Math.floor(generateRandomStat() * 2.5));
        setHitPoints(generateRandomStat() * 44);
        setHealth(getHitPoints());
        setPotion(2);
    }
    
    public int getExperience() {
        return 80;
    }
}