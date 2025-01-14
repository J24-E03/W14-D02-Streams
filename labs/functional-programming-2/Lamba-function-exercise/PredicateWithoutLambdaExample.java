import java.util.List;
import java.util.function.Predicate;

class BiggerThanFive implements Predicate<Integer> {
    @Override
    public boolean test(Integer v) {
        return v > 5;
    }
}

public class PredicateWithoutLambdaExample {
    /**
     * - Create the list having random integer variables.
     * - Create a class which implements predicate
     * - write a boolean method which returns true for number greater than 5
     * - In the main class, create object of above class. Use the filter method and print the numbers.
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.3.1");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(new BiggerThanFive()).forEach(System.out::println);
    }
}