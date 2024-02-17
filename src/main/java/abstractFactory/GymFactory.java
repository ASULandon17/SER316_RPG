package abstractFactory;

public abstract class GymFactory {
    
    public abstract Enemy getPeon();
    
    public abstract Enemy getHenchman();
    
    public abstract Enemy getBoss();
    
}