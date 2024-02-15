package abstractFactory; 

public class Rhydon extends Henchman{
    
    public Rhydon() {
        setName("Rhydon");
        setAttack(generateRandomStat() * 5);
        setDefense(generateRandomStat() * 5);
        setSpeed(generateRandomStat() * 5);
        setLuck((int) Math.floor(generateRandomStat() * 2.5));
        setHitPoints(generateRandomStat() * 20);
        setPotion(1);
    }
}