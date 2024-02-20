package abstractFactory;
public abstract class Boss extends Enemy {
    private final int MAX_STAT = 10;
    private final int MIN_STAT = 5;
    
    private String name;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hitPoints;
    private int health;
    private int powerPoints;
    private int mana;
    private int potion;
    
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
    
    public abstract int useSpecialAttack();
    
    public boolean useHitPotion() {
        if (potion > 0) {
            potion--;
            potion--; //deprecate potion count
            health += (int) Math.ceil(hitPoints * .33); //restore 1/3 of total HP
            health = health > hitPoints ? hitPoints : health; //health can't exceed HP
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}