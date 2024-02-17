package decoratorPattern;

public class Charmeleon extends EvolutionDecorator {
    
    public Charmeleon(Evolution evolution) {
        super(evolution);
    }
    
    public int getAttack() {
        return (int) Math.floor((this.getAttack() * 2));
    }
    
    public int getDefense() {
        return (int) Math.floor((this.getDefense() * 1.5));
    }
    
    public int getSpeed() {
        return (int) Math.floor((this.getSpeed() * 2));
    }
    
    public int getLuck() {
        return this.getLuck();
    }
    
    public int getHitPoints() {
        return (int) Math.floor((this.getHitPoints() * 1.5));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((this.getPowerPoints() * 1.5));
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.CHARMELEON;
    }
}