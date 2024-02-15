package decoratorPattern;

public abstract class Player {
    
    private String name;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int health;
    private int hitPoints;
    private int powerPoints;
    private int potion;
    private int status;
    private int coins;
    private int experience;
    private int level;
    private Equipment weapon = null; //Decorators
    private Equipment shield = null; //Decorators
    private Equipment armor = null; //Decorators
    private Equipment accessory = null; //Decorators
    
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
    
    public boolean equipItem(Equipment item) {
        //create a case statement and check type of item, if its null equip, if not check if item.level > this.item.level
    }
    
    public abstract boolean levelUp();
    
    
}