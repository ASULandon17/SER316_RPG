package abstractFactory;

public class SabrinasGym extends GymFactory {
    
    @Override 
    public Enemy getPeon() {
        return new Abra();
    }
    
    @Override
    public Enemy getHenchman() {
        return new Kadabra();
    }
    
    @Override
    public Enemy getBoss() {
        return new Alakazam();
    }
}