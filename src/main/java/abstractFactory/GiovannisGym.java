package abstractFactory;

public class GiovannisGym extends GymFactory {
    
    @Override 
    public Peon getPeon() {
        return new Machoke();
    }
    
    @Override
    public Henchman getHenchman() {
        return new Rhydon();
    }
    
    @Override
    public Boss getBoss() {
        return new Nidoking();
    }
}