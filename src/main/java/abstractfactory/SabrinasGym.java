package abstractfactory;

/*
 * Concrete factory that creates the correct pokemon for Sabrina's gym.
 */
public class SabrinasGym extends GymFactory {

    /*
     * method for returning the correct peon.
     */
    @Override 
    public Enemy getPeon() {
        return new Abra();
    }

    /*
     * method for returning the correct henchman.
     */
    @Override
    public Enemy getHenchman() {
        return new Kadabra();
    }

    /*
     * method for returning the correct boss.
     */
    @Override
    public Enemy getBoss() {
        return new Alakazam();
    }
}