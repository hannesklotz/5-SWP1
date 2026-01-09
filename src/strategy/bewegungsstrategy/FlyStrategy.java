package strategy.bewegungsstrategy;

public class FlyStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Der Player fliegt.");
    }
}
