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
    
    public PlayerType getPlayerType() {
        return PlayerType.BLASTOISE;
    }
}