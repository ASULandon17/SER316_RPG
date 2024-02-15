package abstractFactory;
public abstract class Boss {
    private final int MAX_STAT = 10;
    private final int MIN_STAT = 5;
    
    private String name;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hitPoints;
    private int powerPoints;
    private int potion;
    private int status;
    
    public int generateRandomStat() {
        return (int) ((Math.random() * (MAX_STAT - MIN_STAT)) + MIN_STAT);
    }
    
    public int useAttack() {
        if ((int) ((Math.random() * (100 - 1)) + 1) <= luck) {
            System.out.println("It's a critical hit!");
            return attack * 2;
        } else {
            return attack;
        }
    }
    
    public abstract int useSpecialAttack(Player player);
    
    public boolean useHitPotion() {
        if (potion > 0) {
            potion--;
            hitPoints += 20;
            return true;
        }
        return false;
    }
    
    public boolean usePowerPotion() {
        if (potion > 0) {
            potion--;
            powerPoints += 10;
            return true;
        }
        return false;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getLuck() {
        return luck;
    }
    
    public void setLuck(int luck) {
        this.luck = luck;
    }
    
    public int getHitPoints() {
        return hitPoints;
    }
    
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}