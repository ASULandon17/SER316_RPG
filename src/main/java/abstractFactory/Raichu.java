package abstractFactory; 

public class Raichu extends Boss{
    
    public Raichu() {
        setName("Raichu");
        setAttack(generateRandomStat() * 2);
        setDefense(generateRandomStat() * 2);
        setSpeed(generateRandomStat() * 2);
        setLuck((int) Math.floor(generateRandomStat()));
        setHitPoints(generateRandomStat() * 5);
        setPowerPoints(generateRandomStat() * 2);
        setPotion(1);
    }
    
    public int useSpecialAttack(Player player) {
        //check if enough PP is available
        if (getPowerPoints() < 4) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Raichu used Thunderbolt!");
        //decrement PP
        setPowerPoints(getPowerPoints() - 4);
        //get damage from a regular attack
        int damage = useAttack();
        //multiply by 1.4 because it's the special attack
        return (int) Math.floor(damage * 1.4);
        
        /*
         * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         * !!!   Figure out how to inflict status here   !!!
         * !!!      Should be a chance of paralysis      !!!
         * !!!       Duration 1: Effect: Can't att       !!!
         * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         */
        
    }
}