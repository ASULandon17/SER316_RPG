package abstractFactory; 

public class Voltorb extends Henchman{
    
    public Voltorb() {
        setName("Voltorb");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat()));
        setHitPoints(generateRandomStat() * 6);
        setHealth(getHitPoints());
        setPotion(1);
    }
    
    public int getExperience() {
        return 10;
    }
}