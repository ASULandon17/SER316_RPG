package decoratorPattern;

public class Charizard extends EvolutionDecorator {

    /*
     * Set the class that is to be decorated.
     */
    public Charizard(Player player) {
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
     * pass through stat with decoration made.
     */
    public int getLuck() {
        return (int) Math.floor((super.getLuck() * 1.1));
    }

    /*
     * pass through stat with decoration made.
     */
    public int getHitPoints() {
        return (int) Math.floor((super.getHitPoints() * 1.15));
    }

    /*
     * pass through stat with decoration made.
     */
    public int getPowerPoints() {
        return super.getPowerPoints();
    }
    
    /*
     * Create update logic for taking a turn in battle.
     */
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

    /*
     * Update PlayerType to reflect new evolution.
     */
    public PlayerType getPlayerType() {
        return PlayerType.CHARIZARD;
    }
}