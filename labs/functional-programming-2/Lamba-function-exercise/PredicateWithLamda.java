import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateWithLamda {
    public static void main(String[] args) {

        List<Integer> jerseys = Arrays.asList(99, 66, 88, 16);
        // Java predicate and lambda stream example usage
        List<Integer> evenNumbers =
                jerseys.stream()
                        .filter( x -> ((x%2)==0))
                        .collect(Collectors.toList());

        // The following line prints: [66, 88, 16] 8
        System.out.println(evenNumbers);

    }
}
