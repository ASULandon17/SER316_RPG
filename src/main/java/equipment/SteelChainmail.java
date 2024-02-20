package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class SteelChainmail extends Equipment {
    
    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public SteelChainmail() {
        super(0, 2, 0, 0, 10, 0, 2, Slot.ARMOR);
        this.setWeaponName("Steel Chainmail");
    }
}