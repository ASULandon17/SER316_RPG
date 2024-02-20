package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class IronDagger extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public IronDagger() {
        super(2, 0, 0, 0, 0, 0, 1, Slot.WEAPON);
        this.setWeaponName("Iron Dagger");
    }
}