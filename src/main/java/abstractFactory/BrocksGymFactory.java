package abstractFactory;

public class BrocksGymFactory extends EnemyFactory {
    
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