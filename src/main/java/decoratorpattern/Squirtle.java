package decoratorpattern;

public class Squirtle extends Player {
    
    /*
     * Create player with proper stats.
     */
    public Squirtle(String name, PlayerClass pclass) {
        super(name, 4, 5, 3, 3, 10, 5, PlayerType.SQUIRTLE, pclass);
    }
}