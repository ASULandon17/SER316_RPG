package abstractFactory;

public class BrocksGym extends GymFactory {
    
    @Override 
    public Peon getPeon() {
        return new Diglett();
    }
    
    @Override
    public Henchman getHenchman() {
        return new Geodude();
    }
    
    @Override
    public Boss getBoss() {
        return new Onix();
    }
}