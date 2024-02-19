package decoratorPattern;

import equipment.Equipment;

public abstract class Player {
    
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
    private int evolution; 
    private PlayerType playerType; //Determines base stats and moves
    private PlayerClass playerClass; //Determines how stats increase
    private Equipment weapon = null; 
    private Equipment shield = null; 
    private Equipment armor = null; 
    private Equipment accessory = null; 
    
    public Player() {
        
    }
    
    public Player(String name, int att, int def, int spd, int luck, int hP, int pP,
            PlayerType pType, PlayerClass pClass) {
        this.name = name;
        this.attack = att;
        this.defense = def;
        this.speed = spd;
        this.luck = luck;
        this.hitPoints = hP;
        this.health = hP;
        this.powerPoints = pP;
        this.mana = pP;
        this.potion = 0;
        this.experience = 0;
        this.nextLevelExp = 3;
        this.level = 1;
        this.evolution = 1;
        this.playerType = pType;
        this.playerClass = pClass;
    }
    
    public int useAttack() {
        if ((int) ((Math.random() * (100 - 1)) + 1) <= luck) {
            System.out.println("It's a critical hit!");
            return this.getAttack() * 2;
        } else {
            return this.getAttack();
        }
    }
    
    public int takeTurn() {
        //use a health potion if health is low
        if ((getHealth() < (getHitPoints() * 0.5)) && getPotion() > 0) {
            usePotion();
            return 0;
        //otherwise just attack
        } else {
            return useAttack();
        }
    }
    
    /*public int takeDamage(int damage) {
        //factor in characters defense
        int calculatedDamage = (int) Math.floor(damage - (.1 * defense));
        System.out.println(this.getDefense());
        
        //1 damage must always be dealt
        calculatedDamage = calculatedDamage > 0 ? calculatedDamage : 1;
        this.health -= calculatedDamage;
        return calculatedDamage;
    }*/
    
    public boolean usePotion() {
        if (potion < 1) { //make sure there are potions to use
            return false;
        }
        potion--; //deprecate potion count
        health += (int) Math.ceil(hitPoints * .33); //restore 1/3 of total HP
        health = health > hitPoints ? hitPoints : health; //health can't exceed HP
        return true;
    }
    
    public void levelUp() {
        while (experience >= nextLevelExp) {
            Experience.levelUp(this);
        }
    }
    
    public boolean addEquipment(Equipment equipment) {
        switch (equipment.getSlot()) {
        
        case WEAPON: 
            if (this.weapon == null || this.weapon.getLevel() < equipment.getLevel()) {
                if (this.weapon != null && this.weapon.getLevel() < equipment.getLevel()) {
                    unequip(this.weapon);
                    this.weapon = null;
                }
                this.weapon = equipment;
                equip(equipment);
            }
            return true;
            
        case SHIELD:
            if (this.shield == null || this.shield.getLevel() < equipment.getLevel()) {
                if (this.shield != null && this.shield.getLevel() < equipment.getLevel()) {
                    unequip(this.shield);
                    this.shield = null;
                }
                this.shield = equipment;
                equip(equipment);
            }
            return true;
            
        case ARMOR:
            if (this.armor == null || this.armor.getLevel() < equipment.getLevel()) {
                if (this.armor != null && this.armor.getLevel() < equipment.getLevel()) {
                    unequip(this.armor);
                    this.armor = null;
                }
                this.armor = equipment;
                equip(equipment);
            }
            return true;
            
        case ACCESSORY:
            if (this.accessory == null || this.accessory.getLevel() < equipment.getLevel()) {
                if (this.accessory != null && this.accessory.getLevel() < equipment.getLevel()) {
                    unequip(this.accessory);
                    this.accessory = null;
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
        this.attack -= equipment.getAttackBuff();
        this.defense -= equipment.getDefenseBuff();
        this.speed -= equipment.getSpeedBuff();
        this.luck -= equipment.getLuckBuff();
        this.hitPoints -= equipment.getHitPointsBuff();
        this.powerPoints -= equipment.getPowerPointsBuff();
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

    public int getEvolution() {
        return evolution;
    }

    public void setEvolution(int evolution) {
        this.evolution = evolution;
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