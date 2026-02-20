package decorator.filepipeline;

public class MemoryDataSource implements DataSource {

    private String storage = "";

    @Override
    public void write(String data) {
        storage = data;
    }

    @Override
    public String read() {
        return storage;
    }

    public String readRaw() {
        return storage;
    }
}