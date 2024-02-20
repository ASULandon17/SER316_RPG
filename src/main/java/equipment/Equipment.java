package equipment;

/**
 * Abstract class that is the blueprint for all equipment.
 */
public abstract class Equipment {
    
    //attributes that keep track of equipments stat buffs
    private int attackBuff;
    private int defenseBuff;
    private int speedBuff;
    private int luckBuff;
    private int hitPointsBuff;
    private int powerPointsBuff;
    private int level;
    private Slot slot;
    private String weaponName;
    
    //enum of slots in inventory that equipment can be stored.
    public enum Slot {
        WEAPON,
        SHIELD,
        ARMOR,
        ACCESSORY
    }
    
    /**
     * Constructor for keeping track of equipment buffs and status.
     * @param attB attack buff
     * @param defB defense buff
     * @param spdB speed buff
     * @param luckB luck buff
     * @param hitB hitpoint buff
     * @param powB powerpoint buff
     * @param lvl the level of the equipment (higher is better)
     * @param slot the slot in a pokemons inventory equipment can be stored
     */
    public Equipment(int attB, int defB, int spdB, int luckB,
                     int hitB, int powB, int lvl, Slot slot) {
        
        this.attackBuff = attB;
        this.defenseBuff = defB;
        this.speedBuff = spdB;
        this.luckBuff = luckB;
        this.hitPointsBuff = hitB;
        this.powerPointsBuff = powB;
        this.level = lvl;
        this.slot = slot;
    }
    
    //the following methods are getters and setters

    public int getAttackBuff() {
        return attackBuff;
    }

    public int getDefenseBuff() {
        return defenseBuff;
    }

    public int getSpeedBuff() {
        return speedBuff;
    }

    public int getLuckBuff() {
        return luckBuff;
    }

    public int getHitPointsBuff() {
        return hitPointsBuff;
    }

    public int getPowerPointsBuff() {
        return powerPointsBuff;
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public Slot getSlot() {
        return this.slot;
    }
    
    public String getWeaponName() {
        return this.weaponName;
    }
    
    public void setWeaponName(String name) {
        this.weaponName = name;
    }
}