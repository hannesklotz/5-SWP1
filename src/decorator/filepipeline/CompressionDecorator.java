package decorator.filepipeline;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void write(String data) {
        wrappee.write(compress(data));
    }

    @Override
    public String read() {
        return decompress(wrappee.read());
    }

    private String compress(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    private String decompress(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char c = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}