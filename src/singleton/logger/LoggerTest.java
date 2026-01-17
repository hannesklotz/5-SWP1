package singleton.logger;

public class LoggerTest {

    public static void main(String[] args) {
        NetworkModule net = new NetworkModule();
        InputModule input = new InputModule();

        net.connect();
        input.readUserInput();

        // Extra: gleiche Instanz?
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Sind logger1 und logger2 dieselbe Instanz? " + (logger1 == logger2));
    }
}
