package abstractFactory;
public abstract class Henchman extends Enemy {
    
    private final int MAX_STAT = 5;
    private final int MIN_STAT = 2;
    
    private String name;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hitPoints;
    private int health;
    private int potion;
    private int status;
    
    
    public int generateRandomStat() {
        return (int) ((Math.random() * (MAX_STAT - MIN_STAT)) + MIN_STAT);
    }
    
    public int takeDamage(int damage) {
        //factor in characters defense
        int calculatedDamage = (int) Math.floor(damage - (.1 * defense));
        
        //1 damage must always be dealt
        calculatedDamage = calculatedDamage > 0 ? calculatedDamage : 1;
        this.health -= calculatedDamage;
        return calculatedDamage;
    }
    
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        } else {
            return useAttack();
        }
    }
    
    public int useAttack() {
        if ((int) ((Math.random() * (100 - 1)) + 1) <= luck) {
            System.out.println("It's a critical hit!");
            return attack * 2;
        } else {
            return attack;
        }
    }
    
    public boolean useHitPotion() {
        if (potion > 0) {
            potion--;
            hitPoints += 20;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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