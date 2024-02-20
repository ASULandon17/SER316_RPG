package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class BruiserGloves extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public BruiserGloves() {
        super(10, 5, 0, 2, 0, 0, 3, Slot.ACCESSORY);
        this.setWeaponName("Bruiser Gloves");
    }
}