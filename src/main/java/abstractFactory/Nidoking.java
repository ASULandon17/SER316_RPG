package abstractFactory; 

public class Nidoking extends Boss{
    
    public Nidoking() {
        setName("Nidoking");
        setAttack(generateRandomStat() * 5);
        setDefense(generateRandomStat() * 5);
        setSpeed(generateRandomStat() * 5);
        setLuck((int) Math.floor(generateRandomStat() * 2.5));
        setHitPoints(generateRandomStat() * 20);
        setPowerPoints(generateRandomStat() * 5);
        setPotion(1);
    }
    
    public int useSpecialAttack() {
        //check if enough PP is available
        if (getPowerPoints() < 6) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Nidoking used Earthquake!");
        //decrement PP
        setPowerPoints(getPowerPoints() - 6);
        //get damage from a regular attack
        int damage = useAttack();
        
        //calculate additional damage based on luck
        int luck = getLuck() > 100 ? 100 : getLuck(); //Max luck == 100
        double damageMultiplier = ((Math.random() * (100 - luck)) + luck) + ((Math.random() * (100 - luck)) + luck);
        damage *= (int) 1 + (.01 * damageMultiplier);
        String message = damageMultiplier >= 2 ? ((damageMultiplier * 3) + " on the Richter scale!") : 
                                                 ((damageMultiplier * 3) + " on the Richeter scale! It's a world destroyer!");
        System.out.println(message);
        return damage;
    }
}