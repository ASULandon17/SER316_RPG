package decoratorPattern;

public class Blastoise extends EvolutionDecorator {
    
    public Blastoise(Player player) {
        super(player);
    }
    
    public int getAttack() {
        return (int) Math.floor((super.getAttack() * 1.75));
    }
    
    public int getDefense() {
        return (int) Math.floor((super.getDefense() * 2));
    }
    
    public int getSpeed() {
        return (int) Math.floor((super.getSpeed() * 1.5));
    }
    
    public int getLuck() {
        return (int) Math.floor((super.getLuck() * 1.5));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.5));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((super.getPowerPoints() * 2));
    }
    
    public int takeTurn() {
        int damage = super.takeTurn();
        if (damage == 0) {
            return 0;
        } else if ((super.getEvolution() == 3) && (super.getMana() >= 8) && (Math.random() > 0.50)) {
            System.out.println(super.getName() + " used Hydro Pump!");
            this.setMana(super.getMana() - 8);
            return (int) Math.ceil(damage * 3);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.BLASTOISE;
    }
}