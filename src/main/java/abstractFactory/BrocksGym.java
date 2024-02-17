package abstractFactory;

public class BrocksGym extends GymFactory {
    
    @Override 
    public Enemy getPeon() {
        return new Diglett();
    }
    
    @Override
    public Enemy getHenchman() {
        return new Geodude();
    }
    
    @Override
    public Enemy getBoss() {
        return new Onix();
    }
}