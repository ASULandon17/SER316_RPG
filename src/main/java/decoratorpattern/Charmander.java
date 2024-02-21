package decoratorpattern;

public class Charmander extends Player {
    
    /*
     * Create player with proper stats.
     */
    public Charmander(String name, PlayerClass pclass) {
        super(name, 5, 3, 5, 2, 10, 3, PlayerType.CHARMANDER, pclass);
    }
}