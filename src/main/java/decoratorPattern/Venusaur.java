package decoratorPattern;

public class Venusaur extends EvolutionDecorator {
    
    public Venusaur(Player player) {
        super(player);
    }
    
    public int getAttack() {
        return (int) Math.floor((super.getAttack() * 1.5));
    }
    
    public int getDefense() {
        return (int) Math.floor((super.getDefense() * 2));
    }
    
    public int getSpeed() {
        return super.getSpeed();
    }
    
    public int getLuck() {
        return (int) Math.floor((super.getLuck() * 1.5));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 2.25));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((super.getPowerPoints() * 1.5));
    }
    
    public int takeTurn() {
        int damage = super.takeTurn();
        if (damage == 0) {
            return 0;
        } else if ((super.getEvolution() == 3) && (super.getMana() >= 8) && (Math.random() > 0.50)) {
            System.out.println(super.getName() + " used Solar Beam!");
            this.setMana(super.getMana() - 8);
            
            //restorative effect for this special move
            int hP = super.getHitPoints();
            int heal = (int) Math.ceil(hP * 0.1);
            int newHealth = heal + super.getHealth() > hP ? hP : heal + super.getHealth();
            this.setHealth(newHealth);
            return (int) Math.ceil(damage * 2.5);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.VENUSAUR;
    }
}