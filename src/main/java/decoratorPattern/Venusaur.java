package decoratorPattern;

public class Venusaur extends EvolutionDecorator {
    
    public Venusaur(Evolution evolution) {
        super(evolution);
    }
    
    public int getAttack() {
        return (int) Math.floor((this.getAttack() * 2));
    }
    
    public int getDefense() {
        return (int) Math.floor((this.getDefense() * 3));
    }
    
    public int getSpeed() {
        return this.getSpeed();
    }
    
    public int getLuck() {
        return (int) Math.floor((this.getLuck() * 2));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((this.getHitPoints() * 3.25));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((this.getPowerPoints() * 2));
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
        } else if ((this.getEvolution() == 3) && (this.getMana() >= 8) && (Math.random() > 0.50)) {
            System.out.println(this.getName() + " used Solar Beam!");
            this.setMana(this.getMana() - 8);
            
            //restorative effect for this special move
            int hP = this.getHitPoints();
            int heal = (int) Math.ceil(hP * 0.1);
            int newHealth = heal + this.getHealth() > hP ? hP : heal + this.getHealth();
            this.setHealth(newHealth);
            return (int) Math.ceil(damage * 2.5);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.VENUSAUR;
    }
}