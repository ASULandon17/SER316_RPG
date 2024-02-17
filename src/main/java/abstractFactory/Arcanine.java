package abstractFactory; 

public class Arcanine extends Boss{
    
    public Arcanine() {
        setName("Arcanine");
        setAttack(generateRandomStat() * 4);
        setDefense(generateRandomStat() * 4);
        setSpeed(generateRandomStat() * 4);
        setLuck((int) Math.floor(generateRandomStat() * 2));
        setHitPoints(generateRandomStat() * 14);
        setPowerPoints(generateRandomStat() * 4);
        setPotion(1);
    }
    
    public int useSpecialAttack() {
        //check if enough PP is available
        if (getPowerPoints() < 5) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Arcanine used Flamethrower!");
        //decrement PP
        setPowerPoints(getPowerPoints() - 5);
        //get damage from a regular attack
        int damage = useAttack();
        //give bonus damage because it's the special attack
        return (int) Math.ceil(damage * 1.7);
    }
}