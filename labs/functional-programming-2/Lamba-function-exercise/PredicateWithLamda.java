import java.util.List;

public class PredicateWithLamda {
    /**
     * - Create the list having integers
     * - Use the lambda predicate expretion which makes code much shorter to filter the numbers which are greater than 5
     * - Print the numbers
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.3.2");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(v -> v > 5).forEach(System.out::println);
    }
}
