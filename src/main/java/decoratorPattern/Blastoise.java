package decoratorPattern;

public class Blastoise extends EvolutionDecorator {
    
    public Blastoise(Evolution evolution) {
        super(evolution);
    }
    
    public int getAttack() {
        return (int) Math.floor((this.getAttack() * 2.5));
    }
    
    public int getDefense() {
        return (int) Math.floor((this.getDefense() * 3));
    }
    
    public int getSpeed() {
        return (int) Math.floor((this.getSpeed() * 2));
    }
    
    public int getLuck() {
        return (int) Math.floor((this.getLuck() * 2));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((this.getHitPoints() * 2));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((this.getPowerPoints() * 3));
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
            System.out.println(this.getName() + " used Hydro Pump!");
            this.setMana(this.getMana() - 8);
            return (int) Math.ceil(damage * 3);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.BLASTOISE;
    }
}