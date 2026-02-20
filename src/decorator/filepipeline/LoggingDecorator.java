package decorator.filepipeline;

public class LoggingDecorator extends DataSourceDecorator {

    public LoggingDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void write(String data) {
        System.out.println("[LOG write] input length = " + data.length());
        super.write(data);
        System.out.println("[LOG write] stored length = " + wrappee.read().length());
    }

    @Override
    public String read() {
        String raw = wrappee.read();
        System.out.println("[LOG read] raw length = " + raw.length());
        return super.read();
    }
}