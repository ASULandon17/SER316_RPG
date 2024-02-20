package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class HalgrothsImpenetrableWall extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public HalgrothsImpenetrableWall() {
        super(2, 20, 0, 0, 10, 0, 3, Slot.SHIELD);
        this.setWeaponName("Halgroth's Impenetrable Wall");
    }
}