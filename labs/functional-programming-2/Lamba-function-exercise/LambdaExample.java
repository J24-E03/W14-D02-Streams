import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args) {
        // create the list
        ArrayList<String> list = new ArrayList<>();

        //add elements
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        // use lambda function to display the list
        list.forEach(System.out::println);
    }
}