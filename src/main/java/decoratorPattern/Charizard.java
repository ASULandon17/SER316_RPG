package decoratorPattern;

public class Charizard extends EvolutionDecorator {
    
    public Charizard(Evolution evolution) {
        super(evolution);
    }
    
    public int getAttack() {
        return (int) Math.floor((this.getAttack() * 3));
    }
    
    public int getDefense() {
        return (int) Math.floor((this.getDefense() * 2));
    }
    
    public int getSpeed() {
        return (int) Math.floor((this.getSpeed() * 3));
    }
    
    public int getLuck() {
        return (int) Math.floor((this.getLuck() * 1.5));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((this.getHitPoints() * 2));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((this.getPowerPoints() * 2));
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.CHARIZARD;
    }
}