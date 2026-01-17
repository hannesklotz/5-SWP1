package singleton.logger;

public class InputModule {

    public void readUserInput() {
        Logger.getInstance().log("InputModule: Benutzereingabe wird gelesen...");
        // ... irgendwas tun ...
        Logger.getInstance().log("InputModule: Eingabe verarbeitet.");
    }
}