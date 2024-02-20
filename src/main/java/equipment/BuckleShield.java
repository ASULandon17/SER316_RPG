package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class BuckleShield extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public BuckleShield() {
        super(0, 2, 0, 0, 0, 0, 1, Slot.SHIELD);
        this.setWeaponName("Buckle Shield");
    }
}