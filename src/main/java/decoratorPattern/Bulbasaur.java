package decoratorPattern;

public class Bulbasaur extends Player {
    
    public Bulbasaur(String name, PlayerClass pClass) {
        super(name, 3, 5, 2, 3, 15, 3, PlayerType.BULBASAUR, pClass);
    }
}