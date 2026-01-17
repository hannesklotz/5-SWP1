package singleton.logger;

public class NetworkModule {

    public void connect() {
        Logger.getInstance().log("NetworkModule: Verbindung wird aufgebaut...");
        // ... irgendwas tun ...
        Logger.getInstance().log("NetworkModule: Verbindung erfolgreich.");
    }
}