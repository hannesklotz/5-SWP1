package strategy.bewegungsstrategy;

public class WalkStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Der Player geht.");
    }
}

