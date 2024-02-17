package abstractFactory;

public class BlainesGym extends GymFactory {
    
    @Override 
    public Enemy getPeon() {
        return new Growlithe();
    }
    
    @Override
    public Enemy getHenchman() {
        return new Rapidash();
    }
    
    @Override
    public Enemy getBoss() {
        return new Arcanine();
    }
}