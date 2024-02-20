package decoratorPattern;

public class Blastoise extends EvolutionDecorator {
    
    public Blastoise(Player player) {
        super(player);
    }
    
    public int getAttack() {
        return (int) Math.floor((super.getAttack() * 1.175));
    }
    
    public int getDefense() {
        return (int) Math.floor((super.getDefense() * 1.2));
    }
    
    public int getSpeed() {
        return (int) Math.floor((super.getSpeed() * 1.15));
    }
    
    public int getLuck() {
        return (int) Math.floor((super.getLuck() * 1.15));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.15));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((super.getPowerPoints() * 1.1));
    }
    
    public int takeTurn() {
        int damage = (int) (super.takeTurn() * 1.175);
        if (damage == 0) {
            return 0;
        } else if ((this.getEvolution() == 3) && (this.getMana() >= 8) && (Math.random() > 0.50)) {
            System.out.println(this.getName() + " used Hydro Pump!");
            this.setMana(this.getMana() - 8);
            return (int) Math.ceil(damage * 1.25);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.BLASTOISE;
    }
}