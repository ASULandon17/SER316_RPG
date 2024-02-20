package abstractFactory;
public abstract class Henchman extends Enemy {
    
    private final int MAX_STAT = 6;
    private final int MIN_STAT = 4;
    
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
    
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            useHitPotion();
            return 0;
        } else if (Math.random() <= .10) {
            System.out.println(this.getName() + " missed!\n");
            return 0;
        } else {
            return useAttack();
        }
    }
    
    public int useAttack() {
        if ((int) ((Math.random() * (100 - 1)) + 1) <= luck) {
            System.out.println("It's a critical hit!");
            return (int) (attack * 1.5);
        } else {
            return attack;
        }
    }
    
    public boolean useHitPotion() {
        if (potion > 0) {
            potion--;
            potion--; //deprecate potion count
            health += (int) Math.ceil(hitPoints * .5); //restore 1/2 of total HP
            health = health > hitPoints ? hitPoints : health; //health can't exceed HP
            System.out.println(this.getName() + " used a potion and was restored to " + health + " health!\n");
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