package decoratorpattern;

public class Bulbasaur extends Player {
    
    /*
     * Create player with proper stats.
     */
    public Bulbasaur(String name, PlayerClass pclass) {
        super(name, 3, 5, 2, 3, 13, 3, PlayerType.BULBASAUR, pclass);
    }
}