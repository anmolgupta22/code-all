package DateandTime;

import java.time.LocalDate;

public class LocalDateExample2 {
    public static void main(String[] args) {
        LocalDate date1= LocalDate.of(2012,1,13);
        System.out.println(date1.isLeapYear());
        LocalDate date2=LocalDate.of(2020,9,23);
        System.out.println(date2.isLeapYear());

    }
}
