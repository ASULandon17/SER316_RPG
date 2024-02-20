package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class TheOneRing extends Equipment {
    
    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public TheOneRing() {
        super(10, 10, 10, 10, 10, 10, 4, Slot.ACCESSORY);
        this.setWeaponName("The One Ring");
    }
}