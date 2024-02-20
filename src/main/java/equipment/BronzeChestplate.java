package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class BronzeChestplate extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public BronzeChestplate() {
        super(0, 0, 0, 0, 3, 0, 1, Slot.ARMOR);
        this.setWeaponName("Bronze Chestplate");
    }
}