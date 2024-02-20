package abstractFactory;

/*
 * Class for creating a 'Boss' level pokemon
 */
public abstract class Boss extends Enemy {
    
    //constants for Boss's stats
    private final int MAX_STAT = 12;
    private final int MIN_STAT = 7;
    
    //attributes for keeping track of Pokemon's status
    private String name;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hitPoints;
    private int health;
    private int powerPoints;
    private int mana;
    private int potion;
    
    /*
     * Generates a random figure for a stat in a range based on constants.
     */
    public int generateRandomStat() {
        return (int) ((Math.random() * (MAX_STAT - MIN_STAT)) + MIN_STAT);
    }
    
    /*
     * Logic for using an attack.
     */
    public int useAttack() {
        if ((int) ((Math.random() * (100 - 1)) + 1) <= luck) {
            System.out.println("It's a critical hit!");
            return (int) (attack * 1.5);
        } else {
            return attack;
        }
    }
    
    /*
     * abstract method to implement a boss's special attack.
     */
    public abstract int useSpecialAttack();
    
    /*
     * Logic for using a hitpoint potion to restore health.
     */
    public boolean useHitPotion() {
        if (potion > 0) {
            potion--;
            potion--; //deprecate potion count
            health += (int) Math.ceil(hitPoints * .5); //restore 1/2 of total HP
            health = health > hitPoints ? hitPoints : health; //health can't exceed HP
            System.out.println(this.getName() + " used a potion and was restored to " + health + " health!\n");
            return true;
        }
        return false;
    }
    
    /*
     * Getter for the Name attribute.
     */
    public String getName() {
        return name;
    }

    /*
     * Setter for the Name attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Getter for the Attack attribute.
     */
    public int getAttack() {
        return attack;
    }

    /*
     * Setter for the Attack attribute.
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /*
     * Getter for the Defense attribute.
     */
    public int getDefense() {
        return defense;
    }

    /*
     * Setter for the Defense attribute.
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /*
     * Getter for the Speed attribute.
     */
    public int getSpeed() {
        return speed;
    }

    /*
     * Setter for the Speed attribute.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /*
     * Getter for the Luck attribute.
     */
    public int getLuck() {
        return luck;
    }

    /*
     * Setter for the Luck attribute.
     */
    public void setLuck(int luck) {
        this.luck = luck;
    }

    /*
     * Getter for the HitPoints attribute.
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /*
     * Setter for the HitPoints attribute.
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /*
     * Getter for the PowerPoints attribute.
     */
    public int getPowerPoints() {
        return powerPoints;
    }

    /*
     * Setter for the PowerPoints attribute.
     */
    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    /*
     * Getter for the Potion attribute.
     */
    public int getPotion() {
        return potion;
    }

    /*
     * Setter for the Potion attribute.
     */
    public void setPotion(int potion) {
        this.potion = potion;
    }

    /*
     * Getter for the Health attribute.
     */
    public int getHealth() {
        return health;
    }

    /*
     * Setter for the Health attribute.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /*
     * Getter for the Mana attribute.
     */
    public int getMana() {
        return mana;
    }

    /*
     * Setter for the Mana attribute.
     */
    public void setMana(int mana) {
        this.mana = mana;
    }
}