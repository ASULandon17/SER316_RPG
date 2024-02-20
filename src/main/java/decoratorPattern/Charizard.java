package decoratorPattern;

public class Charizard extends EvolutionDecorator {
    
    public Charizard(Player player) {
        super(player);
    }
    
    public int getAttack() {
        return (int) Math.floor((super.getAttack() * 1.2));
    }
    
    public int getDefense() {
        return (int) Math.floor((super.getDefense() * 1.15));
    }
    
    public int getSpeed() {
        return (int) Math.floor((super.getSpeed() * 1.2));
    }
    
    public int getLuck() {
        return (int) Math.floor((super.getLuck() * 1.1));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.15));
    }
    
    public int getPowerPoints() {
        return super.getPowerPoints();
    }

    public int takeTurn() {
        int damage = (int) (super.takeTurn() * 1.2);
        if (damage == 0) {
            return 0;
        } else if ((super.getEvolution() == 3) && (super.getMana() >= 8) && (Math.random() > 0.50)) {
            System.out.println(super.getName() + " used Fire Blast!");
            this.setMana(super.getMana() - 8);
            return (int) Math.ceil(damage * 1.4);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.CHARIZARD;
    }
}