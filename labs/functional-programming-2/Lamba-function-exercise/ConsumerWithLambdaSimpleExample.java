import java.util.List;

public class ConsumerWithLambdaSimpleExample {
    /**
     * Create the list and add elements into it. Use lambda function to print the element.
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.1");

        List<String> list = List.of("Apple", "Banana", "Orange", "Grapes", "Pineapple");
        list.forEach(System.out::println);
    }
}
