package strategy.bewegungsstrategy;

public class Player {

    private MovementStrategy strategy;

    public Player(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void move() {
        if (strategy == null) {
            throw new IllegalStateException("Keine MovementStrategy gesetzt.");
        }
        strategy.move();
    }
}

