package decoratorPattern;

public interface Evolution {
    
    public int getAttack();
    
    public int getDefense();
    
    public int getSpeed();
    
    public int getLuck();
    
    public int getHitPoints();
    
    public int getPowerPoints();
    
    public int getMana();
    
    public void setMana(int mana);
    
    public int getHealth();
    
    public void setHealth(int health);
    
    public String getName();
    
    public int getEvolution();
    
    public int takeTurn();
    
    public PlayerType getPlayerType();
}