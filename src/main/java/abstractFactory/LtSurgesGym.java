package abstractFactory;

public class LtSurgesGym extends GymFactory {
    
    @Override 
    public Peon getPeon() {
        return new Magnemite();
    }
    
    @Override
    public Henchman getHenchman() {
        return new Voltorb();
    }
    
    @Override
    public Boss getBoss() {
        return new Raichu();
    }
}