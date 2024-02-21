package abstractfactory;

/*
 * Concrete factory that creates the correct pokemon for Giovanni's gym.
 */
public class GiovannisGym extends GymFactory {
    
    /*
     * method for returning the correct peon.
     */
    @Override 
    public Enemy getPeon() {
        return new Machoke();
    }
    
    /*
     * method for returning the correct henchman.
     */
    @Override
    public Enemy getHenchman() {
        return new Rhydon();
    }
    
    /*
     * method for returning the correct boss.
     */
    @Override
    public Enemy getBoss() {
        return new Nidoking();
    }
}