package decoratorPattern;

public class Charmander extends Player {
    
    public Charmander(String name, PlayerClass pClass) {
        super(name, 5, 3, 5, 2, 10, 3, PlayerType.CHARMANDER, pClass);
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