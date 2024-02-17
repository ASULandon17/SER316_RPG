package decoratorPattern;

import equipment.Equipment;

public abstract class Player implements Evolution{
    
    private String name;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hitPoints; //MAX hitPoints
    private int health; //actual hitPoints left
    private int powerPoints; //MAX powerPoints
    private int mana; //actual powerPoints left
    private int potion;
    private int experience;
    private int nextLevelExp;
    private int level;
    private PlayerType playerType;
    private PlayerClass playerClass;
    private Equipment weapon = null; 
    private Equipment shield = null; 
    private Equipment armor = null; 
    private Equipment accessory = null; 
    
    public abstract int attack(); //pokemon dependent
    
    public abstract int specialAttack(); //pokemon dependent, needs to improve when leveled up
    
    public boolean usePotion() {
        if (potion < 1) { //make sure there are potions to use
            return false;
        }
        potion--; //deprecate potion count
        health += (int) Math.ceil(hitPoints * .33); //restore 1/3 of total HP
        health = health > hitPoints ? hitPoints : health; //health can't exceed HP
        return true;
    }
    
    public boolean equipItem(Evolution item) {
        //create a case statement and check type of item, if its null equip, if not check if item.level > this.item.level
        return true;
    }
    
    //add in functionality to evolve at later levels (Decorator) should be left in child class
    public boolean levelUp() {
        if (experience >= nextLevelExp) {
            Experience.levelUp(this);
            return true;
        }
        return false;
    }
    
    public boolean addEquipment(Equipment equipment) {
        switch (equipment.getSlot()) {
        
        case WEAPON: 
            if (this.weapon == null || this.weapon.getLevel() < equipment.getLevel()) {
                if (this.weapon.getLevel() < equipment.getLevel()) {
                    this.weapon = null;
                    unequip(this.weapon);
                }
                this.weapon = equipment;
                equip(equipment);
            }
            return true;
            
        case SHIELD:
            if (this.shield == null || this.shield.getLevel() < equipment.getLevel()) {
                if (this.shield.getLevel() < equipment.getLevel()) {
                    this.shield = null;
                    unequip(this.weapon);
                }
                this.shield = equipment;
                equip(equipment);
            }
            return true;
            
        case ARMOR:
            if (this.armor == null || this.armor.getLevel() < equipment.getLevel()) {
                if (this.armor.getLevel() < equipment.getLevel()) {
                    this.armor = null;
                    unequip(this.weapon);
                }
                this.armor = equipment;
                equip(equipment);
            }
            return true;
            
        case ACCESSORY:
            if (this.accessory == null || this.accessory.getLevel() < equipment.getLevel()) {
                if (this.accessory.getLevel() < equipment.getLevel()) {
                    this.accessory = null;
                    unequip(this.weapon);
                }
                this.accessory = equipment;
                equip(equipment);
            }
            return true;
            
        default:
            return false;
        }
    }
    
    public void equip(Equipment equipment) {
        this.attack += equipment.getAttackBuff();
        this.defense += equipment.getDefenseBuff();
        this.speed += equipment.getSpeedBuff();
        this.luck += equipment.getLuckBuff();
        this.hitPoints += equipment.getHitPointsBuff();
        this.powerPoints += equipment.getPowerPointsBuff();
    }
    
    public void unequip(Equipment equipment) {
        this.attack -= this.weapon.getAttackBuff();
        this.defense -= this.weapon.getDefenseBuff();
        this.speed -= this.weapon.getSpeedBuff();
        this.luck -= this.weapon.getLuckBuff();
        this.hitPoints -= this.weapon.getHitPointsBuff();
        this.powerPoints -= this.weapon.getPowerPointsBuff();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getNextLevelExp() {
        return nextLevelExp;
    }

    public void setNextLevelExp(int nextLevelExp) {
        this.nextLevelExp = nextLevelExp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }

    public Equipment getWeapon() {
        return weapon;
    }

    public void setWeapon(Equipment weapon) {
        this.weapon = weapon;
    }

    public Equipment getShield() {
        return shield;
    }

    public void setShield(Equipment shield) {
        this.shield = shield;
    }

    public Equipment getArmor() {
        return armor;
    }

    public void setArmor(Equipment armor) {
        this.armor = armor;
    }

    public Equipment getAccessory() {
        return accessory;
    }

    public void setAccessory(Equipment accessory) {
        this.accessory = accessory;
    }
    
    
}