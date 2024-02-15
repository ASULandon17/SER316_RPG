package abstractFactory;

public class SabrinasGym extends GymFactory {
    
    @Override 
    public Peon getPeon() {
        return new Abra();
    }
    
    @Override
    public Henchman getHenchman() {
        return new Kadabra();
    }
    
    @Override
    public Boss getBoss() {
        return new Alakazam();
    }
}