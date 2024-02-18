package decoratorPattern;

public class Ivysaur extends EvolutionDecorator {
    
    public Ivysaur(Evolution evolution) {
        super(evolution);
    }
    
    public int getAttack() {
        return (int) Math.floor((this.getAttack() * 1.5));
    }
    
    public int getDefense() {
        return (int) Math.floor((this.getDefense() * 2));
    }
    
    public int getSpeed() {
        return this.getSpeed();
    }
    
    public int getLuck() {
        return (int) Math.floor((this.getLuck() * 1.5));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((this.getHitPoints() * 2));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((this.getPowerPoints() * 1.5));
    }
    
    public int getMana() {
        return this.getMana();
    }
    
    public void setMana(int mana) {
        this.setMana(mana);
    }
    
    public void setHealth(int health) {
        this.setHealth(health);
    }
    
    public int getHealth() {
        return this.getHealth();
    }
    
    public String getName() {
        return this.getName();
    }
    
    public int getEvolution() {
        return this.getEvolution();
    }
    
    public int takeTurn() {
        int damage = this.takeTurn();
        if (damage == 0) {
            return 0;
        } else if ((this.getEvolution() == 2) && (this.getMana() >= 4) && (Math.random() > 0.50)) {
            System.out.println(this.getName() + " used Razor Leaf!");
            this.setMana(this.getMana() - 4);
            return (int) Math.ceil(damage * 1.5);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.IVYSAUR;
    }
}