import java.util.function.Consumer;

public class ConsumerWithLambda {
    /**
     * - Create consumer object and as a value mention print statement 3 times.
     * - Use the accept method of consumer and which accepts the value and performs the operation.
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.2");

        Consumer<String> consumer = value -> {
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
        };
        consumer.accept("Hello");
    }
}
