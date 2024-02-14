package abstractFactory;
public abstract class Peon {
    
    private final int MAX_STAT = 1;
    private final int MIN_STAT = 3;
    
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hitPoints;
    
    public int useAttack() {
        if ((int) ((Math.random() * 100 - 1)) + 1 >= luck) {
            return attack * 2;
        } else {
            return attack;
        }
    }
    
    public int generateRandomStat() {
        return (int) ((Math.random() * MAX_STAT - MIN_STAT)) + MIN_STAT;
    }
    
    public int getLuck() {
        return luck;
    }
    
    public void setLuck(int luck) {
        this.luck = luck;
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
    
    public int getHitPoints() {
        return hitPoints;
    }
    
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}