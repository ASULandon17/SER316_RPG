package abstractFactory;

public class GiovannisGym extends GymFactory {
    
    @Override 
    public Enemy getPeon() {
        return new Machoke();
    }
    
    @Override
    public Enemy getHenchman() {
        return new Rhydon();
    }
    
    @Override
    public Enemy getBoss() {
        return new Nidoking();
    }
}