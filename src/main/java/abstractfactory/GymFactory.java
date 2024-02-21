package abstractfactory;

/*
 * Abstract factory for creating pokemon for a given gym.
 */
public abstract class GymFactory {
    
    /*
     * Abstract method for creating a peon.
     */
    public abstract Enemy getPeon();
    
    /*
     * Abstract method for creating a henchman.
     */
    public abstract Enemy getHenchman();
    
    /*
     * Abstract method for creating a boss.
     */
    public abstract Enemy getBoss();
    
}