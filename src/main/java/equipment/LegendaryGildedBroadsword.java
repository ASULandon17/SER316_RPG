package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class LegendaryGildedBroadsword extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public LegendaryGildedBroadsword() {
        super(18, 0, 8, 5, 0, 0, 3, Slot.WEAPON);
        this.setWeaponName("Legendary Gilded Broadsword");
    }
}