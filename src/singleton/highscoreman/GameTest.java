package singleton.highscoreman;

public class GameTest {

    public static void main(String[] args) {
        Enemy e1 = new Enemy();
        Enemy e2 = new Enemy();
        Coin c1 = new Coin();

        e1.defeated(); // +50
        c1.collected(); // +10
        e2.defeated(); // +50

        // Erwarteter Score: 110
        int totalScore = HighscoreManager.getInstance().getScore();
        System.out.println("Aktueller Score: " + totalScore);
    }
}
