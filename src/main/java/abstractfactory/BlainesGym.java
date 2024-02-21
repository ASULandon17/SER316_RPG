package abstractfactory;

/*
 * Concrete factory that creates the correct pokemon for Blaine's gym.
 */
public class BlainesGym extends GymFactory {
    
    /*
     * method for returning the correct peon.
     */
    @Override 
    public Enemy getPeon() {
        return new Growlithe();
    }
    
    /*
     * method for returning the correct henchman.
     */
    @Override
    public Enemy getHenchman() {
        return new Rapidash();
    }
    
    /*
     * method for returning the correct boss.
     */
    @Override
    public Enemy getBoss() {
        return new Arcanine();
    }
}