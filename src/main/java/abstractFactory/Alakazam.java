package abstractFactory; 

public class Alakazam extends Boss{
    
    public Alakazam() {
        setName("Alakazam");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat() * 1.5));
        setHitPoints(generateRandomStat() * 9);
        setPowerPoints(generateRandomStat() * 3);
        setPotion(1);
    }
    
    public int useSpecialAttack() {
        //check if enough PP is available
        if (getPowerPoints() < 5) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Alakazam used Psychic!");
        //decrement PP
        setPowerPoints(getPowerPoints() - 5);
        //get damage from a regular attack
        int damage = useAttack();
        //give bonus damage because it's the special attack
        return (int) Math.ceil(damage * 1.6);
    }
}