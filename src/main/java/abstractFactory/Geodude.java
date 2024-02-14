package abstractFactory; 

public class Geodude extends Henchman{
    
    public Geodude() {
        setName("Geodude");
        setAttack(generateRandomStat());
        setDefense(generateRandomStat());
        setSpeed(generateRandomStat());
        setLuck((int) Math.floor(generateRandomStat() / 2 ));
        setHitPoints(generateRandomStat() * 3);
        setPotion(1);
    }
}