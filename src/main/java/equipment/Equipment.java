package equipment;
public abstract class Equipment {
    
    private int attackBuff;
    private int defenseBuff;
    private int speedBuff;
    private int luckBuff;
    private int hitPointsBuff;
    private int powerPointsBuff;
    private int level;
    private Slot slot;
    private String weaponName;
    
    public enum Slot {
        WEAPON,
        SHIELD,
        ARMOR,
        ACCESSORY
    }
    
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

    public int getAttackBuff() {
        return attackBuff;
    }

    public void setAttackBuff(int attackBuff) {
        this.attackBuff = attackBuff;
    }

    public int getDefenseBuff() {
        return defenseBuff;
    }

    public void setDefenseBuff(int defenseBuff) {
        this.defenseBuff = defenseBuff;
    }

    public int getSpeedBuff() {
        return speedBuff;
    }

    public void setSpeedBuff(int speedBuff) {
        this.speedBuff = speedBuff;
    }

    public int getLuckBuff() {
        return luckBuff;
    }

    public void setLuckBuff(int luckBuff) {
        this.luckBuff = luckBuff;
    }

    public int getHitPointsBuff() {
        return hitPointsBuff;
    }

    public void setHitPointsBuff(int hitPointsBuff) {
        this.hitPointsBuff = hitPointsBuff;
    }

    public int getPowerPointsBuff() {
        return powerPointsBuff;
    }

    public void setPowerPointsBuff(int powerPointsBuff) {
        this.powerPointsBuff = powerPointsBuff;
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

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}