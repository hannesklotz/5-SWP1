package singleton.highscoreman;

// Beispiel-Klasse: Gegner
public class Enemy {

    public void defeated() {
        // Gegner gibt z.B. 50 Punkte
        HighscoreManager.getInstance().addPoints(50);
    }
}