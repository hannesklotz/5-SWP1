package singleton.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    // 1) einzige Instanz
    private static Logger instance = null;

    // 2) privater Konstruktor
    private Logger() {
    }

    // 3) Zugriffsmethode
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // 4) Log-Methode
    public void log(String message) {
        String time = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + time + "] " + message);
    }
}
