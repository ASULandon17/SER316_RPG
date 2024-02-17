package abstractFactory; 

public class Rapidash extends Henchman{
    
    public Rapidash() {
        setName("Rapidash");
        setAttack(generateRandomStat() * 4);
        setDefense(generateRandomStat() * 4);
        setSpeed(generateRandomStat() * 4);
        setLuck((int) Math.floor(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 14);
        setHealth(getHitPoints());
        setPotion(1);
    }
}