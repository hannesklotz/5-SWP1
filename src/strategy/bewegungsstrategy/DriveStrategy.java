package strategy.bewegungsstrategy;

public class DriveStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Der Player fährt.");
    }
}
