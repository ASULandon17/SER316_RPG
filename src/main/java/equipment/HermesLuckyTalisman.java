package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class HermesLuckyTalisman extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public HermesLuckyTalisman() {
        super(0, 0, 0, 7, 0, 2, 2, Slot.ACCESSORY);
        this.setWeaponName("Hermes' Lucky Talisman");
    }
}