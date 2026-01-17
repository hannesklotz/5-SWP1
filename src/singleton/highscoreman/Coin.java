package singleton.highscoreman;

// Beispiel-Klasse: Münze
public class Coin {

    public void collected() {
        // Münze gibt z.B. 10 Punkte
        HighscoreManager.getInstance().addPoints(10);
    }
}
