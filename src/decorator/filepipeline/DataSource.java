package decorator.filepipeline;

public interface DataSource {
    void write(String data);
    String read();
}