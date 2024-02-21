package abstractfactory;

/*
 * Concrete factory that creates the correct pokemon for Brock's gym.
 */
public class BrocksGym extends GymFactory {
    
    /*
     * method for returning the correct peon.
     */
    @Override 
    public Enemy getPeon() {
        return new Diglett();
    }
    
    /*
     * method for returning the correct henchman.
     */
    @Override
    public Enemy getHenchman() {
        return new Geodude();
    }
    
    /*
     * method for returning the correct boss.
     */
    @Override
    public Enemy getBoss() {
        return new Onix();
    }
}