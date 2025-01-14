import java.util.function.Supplier;

public class SupplierSimpleExampleWithLambda {
    /**
     * - Use supplier interface and declare a string.
     * - Print teh string on console.
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.4.1");

        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());
    }
}
