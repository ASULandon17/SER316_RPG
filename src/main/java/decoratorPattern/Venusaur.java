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
    
    public PlayerType getPlayerType() {
        return PlayerType.VENUSAUR;
    }
}