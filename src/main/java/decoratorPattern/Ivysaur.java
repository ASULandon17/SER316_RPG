package decoratorPattern;

public class Ivysaur extends EvolutionDecorator {
    
    public Ivysaur(Player player) {
        super(player);
        System.out.println("\n\n\n\nGet player class from player " + player.getPlayerClass() + "\n\n\n\n");
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
        return (int) Math.floor((super.getHitPoints() * 1.2));
    }
    
    public int getPowerPoints() {
        return (int) Math.floor((super.getPowerPoints() * 1.15));
    }
    
    public int getMana() {
        return super.getMana();
    }
    
    public void setMana(int mana) {
        super.setMana(mana);
    }
    
    public void setHealth(int health) {
        super.setHealth(health);
    }
    
    public int getHealth() {
        return super.getHealth();
    }
    
    public String getName() {
        return super.getName();
    }
    
    public int getEvolution() {
        return super.getEvolution();
    }
    
    public int takeTurn() {
        int damage = (int) (super.takeTurn() * 1.15);
        if (damage == 0) {
            return 0;
        } else if ((this.getEvolution() == 2) && (this.getMana() >= 4) && (Math.random() > 0.50)) {
            System.out.println(this.getName() + " used Razor Leaf!");
            this.setMana(this.getMana() - 4);
            return (int) Math.ceil(damage * 1.25);
        } else {
            return damage;
        }
    }
    
    public PlayerType getPlayerType() {
        return PlayerType.IVYSAUR;
    }
}