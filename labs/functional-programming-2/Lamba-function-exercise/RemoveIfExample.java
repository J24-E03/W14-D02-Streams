import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {
    /**
     * - Create the list and add some integers
     * - Invoke the removeIf method on input with a lambda expression that checks if a number is even
     * - Print the result
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.6");

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        integers.removeIf(n -> n % 2 == 0);
        System.out.println(integers);
    }

}
