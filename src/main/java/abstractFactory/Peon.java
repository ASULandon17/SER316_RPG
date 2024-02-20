package abstractFactory;

/*
 * Class for creating a 'Peon' level pokemon
 */
public abstract class Peon extends Enemy {
    
  //constants for Peon's stats
    private final int MAX_STAT = 4;
    private final int MIN_STAT = 2;
    
    //attributes for keeping track of Pokemon's status
    private String name;
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hitPoints;
    private int health;
    
    /*
     * Generates a random figure for a stat in a range based on constants.
     */
    public int generateRandomStat() {
        return (int) ((Math.random() * (MAX_STAT - MIN_STAT)) + MIN_STAT);
    }

    /*
     * create logic for taking a turn in battle.
     */
    public int takeTurn() {
        if (Math.random() <= .15) {
            System.out.println(this.getName() + " missed!\n");
            return 0;
        }
        return useAttack();
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
}