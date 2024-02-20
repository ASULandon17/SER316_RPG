package abstractFactory; 

public class Rapidash extends Henchman{
    
    public Rapidash() {
        setName("Rapidash");
        setAttack(generateRandomStat() * 9);
        setDefense(generateRandomStat() * 7);
        setSpeed(generateRandomStat() * 14);
        setLuck((int) Math.floor(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 17);
        setHealth(getHitPoints());
        setPotion(1);
    }
    
    public int getExperience() {
        return 40;
    }
}