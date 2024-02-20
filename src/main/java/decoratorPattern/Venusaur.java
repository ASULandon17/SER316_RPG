package decoratorPattern;

public class Venusaur extends EvolutionDecorator {

    /*
     * Set the class that is to be decorated.
     */
    public Venusaur(Player player) {
        super(player);
    }

    /*
     * pass through stat with decoration made.
     */
    public int getAttack() {
        return (int) Math.floor((super.getAttack() * 1.1));
    }

    /*
     * pass through stat with decoration made.
     */
    public int getDefense() {
        return (int) Math.floor((super.getDefense() * 1.2));
    }

    /*
     * pass through stat as is.
     */
    public int getSpeed() {
        return super.getSpeed();
    }

    /*
     * pass through stat with decoration made.
     */
    public int getLuck() {
        return (int) Math.floor((super.getLuck() * 1.15));
    }

    /*
     * pass through stat with decoration made.
     */
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.3));
    }

    /*
     * pass through stat with decoration made.
     */
    public int getPowerPoints() {
        return (int) Math.floor((super.getPowerPoints() * 1.1));
    }

    /*
     * Create update logic for taking a turn in battle.
     */
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
            return (int) Math.ceil(damage * 1.2);
        } else {
            return damage;
        }
    }

    /*
     * Update PlayerType to reflect new evolution.
     */
    public PlayerType getPlayerType() {
        return PlayerType.VENUSAUR;
    }
}