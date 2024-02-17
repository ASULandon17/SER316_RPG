package abstractFactory;

public class LtSurgesGym extends GymFactory {
    
    @Override 
    public Enemy getPeon() {
        return new Magnemite();
    }
    
    @Override
    public Enemy getHenchman() {
        return new Voltorb();
    }
    
    @Override
    public Enemy getBoss() {
        return new Raichu();
    }
}