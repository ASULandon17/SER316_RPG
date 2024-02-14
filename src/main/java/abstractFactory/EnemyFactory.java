package abstractFactory;

public abstract class EnemyFactory {
    
    public abstract Peon getPeon();
    
    public abstract Henchman getHenchman();
    
    public abstract Boss getBoss();
}