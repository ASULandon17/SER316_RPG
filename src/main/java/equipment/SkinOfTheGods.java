package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class SkinOfTheGods extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public SkinOfTheGods() {
        super(0, 5, 2, 0, 20, 0, 3, Slot.ARMOR);
        this.setWeaponName("Skin Of The Gods");
    }
}