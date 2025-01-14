import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierSimpleExampleWithLambda {
    public static void main(String[] args) {
        printTime();
    }

    private static void printTime() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime now = LocalTime.now();
        Supplier<LocalTime> nowSuppl = LocalTime::now;
        System.out.println(now.format(f)); // 12:13:37
        System.out.println(nowSuppl.get().format(f)); // 12:13:37
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(now.format(f)); // 12:13:37
        System.out.println(nowSuppl.get().format(f)); // 12:13:37
    }
}
