package abstractFactory;

public class BlainesGym extends GymFactory {
    
    @Override 
    public Peon getPeon() {
        return new Growlithe();
    }
    
    @Override
    public Henchman getHenchman() {
        return new Rapidash();
    }
    
    @Override
    public Boss getBoss() {
        return new Arcanine();
    }
}