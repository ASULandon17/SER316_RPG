package decoratorpattern;

public class Charmeleon extends EvolutionDecorator {
    
    /*
     * Set the class that is to be decorated.
     */
    public Charmeleon(Player player) {
        super(player);
    }

    /*
     * pass through stat with decoration made.
     */
    public int getAttack() {
        return (int) Math.floor((super.getAttack() * 1.2));
    }

    /*
     * pass through stat with decoration made.
     */
    public int getDefense() {
        return (int) Math.floor((super.getDefense() * 1.15));
    }

    /*
     * pass through stat with decoration made.
     */
    public int getSpeed() {
        return (int) Math.floor((super.getSpeed() * 1.2));
    }

    /*
     * pass through stat as is.
     */
    public int getLuck() {
        return super.getLuck();
    }

    /*
     * pass through stat with decoration made.
     */
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.15));
    }

    /*
     * pass through stat as is.
     */
    public int getPowerPoints() {
        return (int) super.getPowerPoints();
    }

    /*
     * Create update logic for taking a turn in battle.
     */
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

    /*
     * Update PlayerType to reflect new evolution.
     */
    public PlayerType getPlayerType() {
        return PlayerType.CHARMELEON;
    }
}