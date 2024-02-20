package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class PolishedSilverBlade extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public PolishedSilverBlade() {
        super(5, 0, 3, 0, 0, 0, 2, Slot.WEAPON);
        this.setWeaponName("Polished Silver Blade");
    }
}