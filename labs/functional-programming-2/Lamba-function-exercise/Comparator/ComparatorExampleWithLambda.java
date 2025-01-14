package Comparator;

import java.util.ArrayList;

public class ComparatorExampleWithLambda {
    /**
     * - Create Employee Class and declare properties ,getters and setters
     * - Create a main class and add few employee records
     * - Add those employees in list
     * - Use the lambda sort method to sort first ame and last name
     * - Print the record
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.5.2");

        //create a few dummy employee records and put them in a simple ArrayList instance.
        Employee employee1 = new Employee(2, "A", "F", 18);
        Employee employee2 = new Employee(3, "z", "P", 20);
        Employee employee3 = new Employee(5, "c", "G", 17);
        Employee employee4 = new Employee(1, "d", "F", 21);
        Employee employee5 = new Employee(4, "w", "W", 22);

        //add employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        //sort the list using sort method
        employees.sort(
                (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())
        );

        for(Employee e: employees) {
            System.out.println(e);
        }
    }
}
