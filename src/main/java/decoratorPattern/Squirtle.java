package decoratorPattern;

public class Squirtle extends Player {
    
    public Squirtle(String name, PlayerClass pClass) {
        super(name, 4, 5, 3, 3, 10, 5, PlayerType.SQUIRTLE, pClass);
    }
}