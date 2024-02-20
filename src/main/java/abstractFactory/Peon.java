package abstractFactory;
public abstract class Peon extends Enemy {
    
    private final int MAX_STAT = 4;
    private final int MIN_STAT = 2;
    
    private String name;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hitPoints;
    private int health;
    
    public int generateRandomStat() {
        return (int) ((Math.random() * (MAX_STAT - MIN_STAT)) + MIN_STAT);
    }
    
    public int takeTurn() {
        if (Math.random() <= .15) {
            System.out.println(this.getName() + " missed!\n");
            return 0;
        }
        return useAttack();
    }
    
    public int useAttack() {
        if ((int) ((Math.random() * (100 - 1)) + 1) <= luck) {
            System.out.println("It's a critical hit!");
            return (int) (attack * 1.5);
        } else {
            return attack;
        }
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
}