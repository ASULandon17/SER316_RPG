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
        setHealth(getHitPoints());
        setMana(getPowerPoints());
        setPotion(1);
    }
    
    public int useSpecialAttack() {
        System.out.println("Nidoking used Earthquake!");
        //decrement PP
        setPowerPoints(getPowerPoints() - 6);
        //get damage from a regular attack
        int damage = useAttack();
        
        //calculate additional damage based on luck
        int luck = getLuck() > 100 ? 100 : getLuck(); //Max luck == 100
        double damageMultiplier = ((Math.random() * (100 - luck)) + luck) + ((Math.random() * (100 - luck)) + luck);
        damage *= (int) 1 + Math.floor(.01 * damageMultiplier);
        String message = damageMultiplier <= 2 ? (Math.floor(damageMultiplier * .03) + " on the Richter scale!") : 
                                                 (Math.floor(damageMultiplier * .03) + " on the Richter scale! It's a world destroyer!");
        System.out.println(message);
        return damage;
    }
    
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        //use sp.attack ~33% of the time if enough mana 
        } else if ((getMana() >= 6) && (Math.random() > 0.33)) {
            return useSpecialAttack();
        //otherwise just attack
        } else {
            return useAttack();
        }
    }
}