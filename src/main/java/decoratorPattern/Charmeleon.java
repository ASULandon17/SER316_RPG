package decoratorPattern;

public class Charmeleon extends EvolutionDecorator {
    
    public Charmeleon(Player player) {
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
        return super.getLuck();
    }
    
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.15));
    }
    
    public int getPowerPoints() {
        return (int) super.getPowerPoints();
    }
    
    public int takeTurn() {
        int damage = (int) (super.takeTurn() * 1.1);
        if (damage == 0) {
            return 0;
        } else if ((this.getEvolution() == 2) && (this.getMana() >= 4) && (Math.random() > 0.50)) {
            System.out.println(this.getName() + " used Flamethrower!");
            this.setMana(this.getMana() - 4);
            return (int) Math.ceil(damage * 1.2);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.CHARMELEON;
    }
}