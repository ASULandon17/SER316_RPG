package decoratorPattern;

public class Charizard extends EvolutionDecorator {
    
    public Charizard(Player player) {
        super(player);
    }
    
    public int getAttack() {
        return (int) Math.floor((super.getAttack() * 2));
    }
    
    public int getDefense() {
        return (int) Math.floor((super.getDefense() * 1.5));
    }
    
    public int getSpeed() {
        return (int) Math.floor((super.getSpeed() * 2));
    }
    
    public int getLuck() {
        return (int) Math.floor((super.getLuck() * 1.25));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.5));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((super.getPowerPoints() * 1.5));
    }

    public int takeTurn() {
        int damage = super.takeTurn();
        if (damage == 0) {
            return 0;
        } else if ((super.getEvolution() == 3) && (super.getMana() >= 8) && (Math.random() > 0.50)) {
            System.out.println(super.getName() + " used Fire Blast!");
            this.setMana(super.getMana() - 8);
            return (int) Math.ceil(damage * 3.25);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.CHARIZARD;
    }
}