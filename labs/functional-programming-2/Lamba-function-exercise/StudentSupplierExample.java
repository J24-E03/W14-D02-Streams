import java.util.function.Supplier;

public class StudentSupplierExample {
    /**
     * - Create the student class and define the variables.
     * - Create student supplier using supplier interface.
     * - Using get method of supplier interace , fetch the student object from student stupplier
     * - Print the result.
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.4.2");

        Student student = new Student(1, "John", "d", 25);
        Supplier<Student> studentSupplier = () -> student;
        Student student1 = studentSupplier.get();
        System.out.println(student1);
    }
}
