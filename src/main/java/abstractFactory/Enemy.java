package abstractFactory;

public abstract class Enemy {
    
    public abstract int takeTurn();
    
    public abstract String getName();
    
    public abstract int getHealth();
    
    public abstract void setHealth(int health);
    
    public abstract int getDefense();
    
    public abstract int getSpeed();
    
    public abstract int getExperience();
}