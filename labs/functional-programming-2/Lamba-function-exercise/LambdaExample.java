import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args) {
        // create the list
        ArrayList<String> fruits = new ArrayList<>();



        //add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // use lambda function to display the list
        fruits.forEach(item -> System.out.println(item));

    }
}