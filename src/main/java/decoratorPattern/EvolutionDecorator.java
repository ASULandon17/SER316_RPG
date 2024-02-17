package decoratorPattern;

public abstract class EvolutionDecorator implements Evolution {
    protected Evolution evolution;
    
    public EvolutionDecorator(Evolution evolution) {
        this.evolution = evolution;
    }
}