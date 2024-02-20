package equipment;

/**
 * A piece of equipment a pokemon can add to its inventory.
 */
public class ReinforcedKiteshield extends Equipment {

    /**
     * Constructor for creating the equipment with its proper stats.
     */
    public ReinforcedKiteshield() {
        super(0, 5, 0, 0, 3, 0, 2, Slot.SHIELD);
        this.setWeaponName("Reinforced Kiteshield");
    }
}