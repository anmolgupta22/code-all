package DateandTime;
import java.time.LocalDate;
//localdate fun()
public class LocalDateExample1 {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        LocalDate yesterday =LocalDate.now();
        LocalDate tomorrow =LocalDate.now();
        System.out.println("Today date:"+date);
        System.out.println("Today date:"+yesterday);
        System.out.println("Today date:"+tomorrow);
    }
}
