package abstractFactory;

public abstract class GymFactory {
    
    public abstract Peon getPeon();
    
    public abstract Henchman getHenchman();
    
    public abstract Boss getBoss();
}