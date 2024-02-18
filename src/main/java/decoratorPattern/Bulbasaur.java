package decoratorPattern;

public class Bulbasaur extends Player {
    
    public Bulbasaur(String name, PlayerClass pClass) {
        super(name, 3, 5, 2, 3, 15, 3, PlayerType.BULBASAUR, pClass);
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