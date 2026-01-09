package strategy.bewegungsstrategy;

public class TestPlayerMovement {

    public static void main(String[] args) {
        Player player = new Player(new WalkStrategy());

        player.move(); // geht

        player.setStrategy(new DriveStrategy());
        player.move(); // fährt

        player.setStrategy(new FlyStrategy());
        player.move(); // fliegt

        player.setStrategy(new WalkStrategy());
        player.move(); // geht
    }
}
