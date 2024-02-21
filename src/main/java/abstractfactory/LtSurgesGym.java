package abstractfactory;

/*
 * Concrete factory that creates the correct pokemon for Lt. Surge's gym.
 */
public class LtSurgesGym extends GymFactory {
    
    /*
     * method for returning the correct peon.
     */
    @Override 
    public Enemy getPeon() {
        return new Magnemite();
    }
    
    /*
     * method for returning the correct henchman.
     */
    @Override
    public Enemy getHenchman() {
        return new Voltorb();
    }
    
    /*
     * method for returning the correct boss.
     */
    @Override
    public Enemy getBoss() {
        return new Raichu();
    }
}