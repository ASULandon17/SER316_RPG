package abstractFactory; 

public class Raichu extends Boss{
    
    public Raichu() {
        setName("Raichu");
        setAttack(generateRandomStat() * 3);
        setDefense(generateRandomStat() * 3);
        setSpeed(generateRandomStat() * 3);
        setLuck((int) Math.floor(generateRandomStat()));
        setHitPoints(generateRandomStat() * 6);
        setPowerPoints(generateRandomStat() * 2);
        setHealth(getHitPoints());
        setMana(getPowerPoints());
        setPotion(1);
    }
    
    public int useSpecialAttack() {
        //check if enough PP is available
        if (getPowerPoints() < 5) {
            System.out.println("Not enough PP for this move!");
            return -1;
        }
        System.out.println("Raichu used Thunderbolt!");
        //decrement PP
        setMana(getMana() - 4);
        //get damage from a regular attack
        int damage = useAttack();
        //multiply by 1.4 because it's the special attack
        return (int) Math.floor(damage * 1.4);
    }
    
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        } else if (Math.random() < .05) {
            System.out.println("Raichu missed!");
            return 0;
        //use sp.attack ~33% of the time if enough mana 
        } else if ((getMana() > 5) && (Math.random() <= 0.2)) {
            return useSpecialAttack();
        //otherwise just attack
        } else {
            return useAttack();
        }
    }
    
    public int getExperience() {
        return 20;
    }
}