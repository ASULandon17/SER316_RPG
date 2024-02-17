package abstractFactory; 

public class Onix extends Boss{
    
    public Onix() {
        setName("Onix");
        setAttack(generateRandomStat());
        setDefense(generateRandomStat());
        setSpeed(generateRandomStat());
        setLuck((int) Math.floor(generateRandomStat() / 2 ));
        setHitPoints(generateRandomStat() * 3);
        setPowerPoints(generateRandomStat());
        setPotion(1);
    }
    
    public int useSpecialAttack() {
        //check if enough PP is available
        if (getPowerPoints() < 3) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Onix used Slam!");
        //decrement PP
        setPowerPoints(getPowerPoints() - 3);
        //get damage from a regular attack
        int damage = useAttack();
        //multiply by 1.5 because it's the special attack
        return (int) Math.floor(damage * 1.4);
    }
}