package decorator.filepipeline;

public class DecoratorPipelineTest {

    public static void main(String[] args) {

        String original = "aaabbbbccccXYZ";

        MemoryDataSource base = new MemoryDataSource();

        DataSource dataSource =
                new LoggingDecorator(
                        new EncryptionDecorator(
                                new CompressionDecorator(base),
                                3
                        )
                );

        System.out.println("=== Writing ===");
        dataSource.write(original);

        System.out.println("\n=== Reading ===");
        String result = dataSource.read();

        System.out.println("\nOriginal: " + original);
        System.out.println("Read:     " + result);
        System.out.println("Equal?    " + original.equals(result));
    }
}