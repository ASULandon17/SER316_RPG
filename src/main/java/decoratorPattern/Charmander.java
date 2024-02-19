package decoratorPattern;

public class Charmander extends Player {
    
    public Charmander(String name, PlayerClass pClass) {
        super(name, 5, 3, 5, 2, 10, 3, PlayerType.CHARMANDER, pClass);
    }
}