package abstractFactory; 

public class Voltorb extends Henchman{
    
    public Voltorb() {
        setName("Voltorb");
        setAttack(generateRandomStat() * 2);
        setDefense(generateRandomStat() * 2);
        setSpeed(generateRandomStat() * 2);
        setLuck((int) Math.floor(generateRandomStat()));
        setHitPoints(generateRandomStat() * 5);
        setPotion(1);
    }
}