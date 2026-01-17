package singleton.highscoreman;

public class HighscoreManager {

    // 1) statische Variable für die einzige Instanz
    private static HighscoreManager instance = null;

    // 2) Highscore-Daten
    private int score;

    // 3) privater Konstruktor – von außen NICHT aufrufbar
    private HighscoreManager() {
        score = 0;
    }

    // 4) Zugriffsmethode: einzige Möglichkeit, an die Instanz zu kommen
    public static HighscoreManager getInstance() {
        if (instance == null) {
            instance = new HighscoreManager();
        }
        return instance;
    }

    // 5) Fachmethoden
    public void addPoints(int p) {
        score += p;
    }

    public int getScore() {
        return score;
    }
}
