package abstractFactory;

public abstract class GymFactory {
    
    public abstract Peon getPeon();
    
    public abstract Henchman getHenchman();
    
    public abstract Boss getBoss();
    
    //implement Gym status effect here? have a decorator created for enemy and player?
}