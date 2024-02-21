package abstractfactory;

/*
 * Abstract class for creating a pokemon with factory.
 */
public abstract class Enemy {
    
    /*
     * These are all abstract methods that must be implemented by the
     * concrete 'enemy' objects that are created by the factories.
     * They are called on the enemy class so they're present here.
     */
    
    public abstract int takeTurn();
    
    public abstract String getName();
    
    public abstract int getHealth();
    
    public abstract void setHealth(int health);
    
    public abstract int getDefense();
    
    public abstract int getSpeed();
    
    public abstract int getExperience();
}