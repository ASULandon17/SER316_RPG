package decoratorPattern;

public class Venusaur extends EvolutionDecorator {
    
    public Venusaur(Player player) {
        super(player);
    }
    
    public int getAttack() {
        return (int) Math.floor((super.getAttack() * 1.15));
    }
    
    public int getDefense() {
        return (int) Math.floor((super.getDefense() * 1.2));
    }
    
    public int getSpeed() {
        return super.getSpeed();
    }
    
    public int getLuck() {
        return (int) Math.floor((super.getLuck() * 1.15));
    }
    
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.3));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((super.getPowerPoints() * 1.15));
    }
    
    public int takeTurn() {
        int damage = (int) (super.takeTurn() * 1.15);
        if (damage == 0) {
            return 0;
        } else if ((this.getEvolution() == 3) && (this.getMana() >= 8) && (Math.random() > 0.50)) {
            System.out.println(this.getName() + " used Solar Beam!");
            this.setMana(this.getMana() - 8);
            
            //restorative effect for this special move
            int hP = this.getHitPoints();
            int heal = (int) Math.ceil(hP * 0.1);
            int newHealth = heal + this.getHealth() > hP ? hP : heal + this.getHealth();
            this.setHealth(newHealth);
            System.out.println(this.getName() + " recovered " + heal + " HP!");
            return (int) Math.ceil(damage * 1.75);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.VENUSAUR;
    }
}