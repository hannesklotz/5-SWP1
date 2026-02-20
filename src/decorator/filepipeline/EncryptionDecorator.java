package decorator.filepipeline;

public class EncryptionDecorator extends DataSourceDecorator {

    private int shift;

    public EncryptionDecorator(DataSource wrappee, int shift) {
        super(wrappee);
        this.shift = shift;
    }

    @Override
    public void write(String data) {
        wrappee.write(caesar(data, shift));
    }

    @Override
    public String read() {
        return caesar(wrappee.read(), -shift);
    }

    private String caesar(String text, int shift) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            sb.append((char)(c + shift));
        }

        return sb.toString();
    }
}