package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class FleetFootCharm extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public FleetFootCharm() {
        super(0, 0, 3, 1, 0, 0, 1, Slot.ACCESSORY);
        this.setWeaponName("Fleet Foot Charm");
    }
}