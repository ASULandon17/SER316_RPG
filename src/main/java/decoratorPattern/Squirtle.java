package decoratorPattern;

public class Squirtle extends Player {
    
    public Squirtle(String name, PlayerClass pClass) {
        super(name, 4, 5, 3, 3, 10, 5, PlayerType.SQUIRTLE, pClass);
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
}