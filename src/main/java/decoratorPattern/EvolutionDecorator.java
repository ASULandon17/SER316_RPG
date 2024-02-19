package decoratorPattern;

import equipment.Equipment;

public abstract class EvolutionDecorator extends Player {
    protected Player player;
    
    public EvolutionDecorator(Player player) {
        this.player = player;
    }
    
    public int useAttack() {
        return player.useAttack();
    }
    
    public int takeTurn() {
        return player.takeTurn();
    }
    
    public boolean usePotion() {
        return player.usePotion();
    }
    
    public void levelUp() {
        player.levelUp();
    }
    
    public boolean addEquipment(Equipment equipment) {
        return player.addEquipment(equipment);
    }
    
    public void equip(Equipment equipment) {
        player.equip(equipment);
    }
    
    public void unequip(Equipment equipment) {
        player.unequip(equipment);
    }
    
    public String getName() {
        return player.getName();
    }

    public void setName(String name) {
        player.setName(name);
    }

    public int getAttack() {
        return player.getAttack();
    }

    public void setAttack(int attack) {
        player.setAttack(attack);
    }

    public int getDefense() {
        return player.getDefense();
    }

    public void setDefense(int defense) {
        player.setDefense(defense);
    }

    public int getSpeed() {
        return player.getSpeed();
    }

    public void setSpeed(int speed) {
        player.setSpeed(speed);
    }

    public int getLuck() {
        return player.getLuck();
    }

    public void setLuck(int luck) {
        player.setLuck(luck);
    }

    public int getHitPoints() {
        return player.getHitPoints();
    }

    public void setHitPoints(int hitPoints) {
        player.setHitPoints(hitPoints);
    }
    
    public int getHealth() {
        return player.getHealth();
    }

    public void setHealth(int health) {
        player.setHealth(health);
    }

    public int getPowerPoints() {
        return player.getPowerPoints();
    }

    public void setPowerPoints(int powerPoints) {
        player.setPowerPoints(powerPoints);
    }

    public int getMana() {
        return player.getMana();
    }

    public void setMana(int mana) {
        player.setMana(mana);
    }

    public int getPotion() {
        return player.getPotion();
    }

    public void setPotion(int potion) {
        player.setPotion(potion);
    }

    public int getExperience() {
        return player.getExperience();
    }

    public void setExperience(int experience) {
        player.setExperience(experience);
    }

    public int getNextLevelExp() {
        return player.getNextLevelExp();
    }

    public void setNextLevelExp(int nextLevelExp) {
        player.setNextLevelExp(nextLevelExp);
    }

    public int getLevel() {
        return player.getLevel();
    }

    public void setLevel(int level) {
        player.setLevel(level);
    }

    public int getEvolution() {
        return player.getEvolution();
    }

    public void setEvolution(int evolution) {
        player.setEvolution(evolution);
    }

    public PlayerType getPlayerType() {
        return player.getPlayerType();
    }

    public void setPlayerType(PlayerType playerType) {
        player.setPlayerType(playerType);
    }

    public PlayerClass getPlayerClass() {
        return player.getPlayerClass();
    }

    public void setPlayerClass(PlayerClass playerClass) {
        player.setPlayerClass(playerClass);
    }

    public Equipment getWeapon() {
        return player.getWeapon();
    }

    public void setWeapon(Equipment weapon) {
        player.setWeapon(weapon);
    }

    public Equipment getShield() {
        return player.getShield();
    }

    public void setShield(Equipment shield) {
        player.setShield(shield);
    }

    public Equipment getArmor() {
        return player.getArmor();
    }

    public void setArmor(Equipment armor) {
        player.setArmor(armor);
    }

    public Equipment getAccessory() {
        return player.getAccessory();
    }

    public void setAccessory(Equipment accessory) {
        player.setAccessory(accessory);
    }
}