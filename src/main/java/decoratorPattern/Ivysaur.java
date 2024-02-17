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
    
    public PlayerType getPlayerType() {
        return PlayerType.IVYSAUR;
    }
}