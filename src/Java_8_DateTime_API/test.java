package Java_8_DateTime_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class test {
    public static void main(String[] args) {
        LocalDate a=LocalDate.now();
        System.out.println(a);
        System.out.println("-------------------");

        LocalTime b=LocalTime.now();
        System.out.println(b);
        System.out.println("___________________-");

        LocalDateTime c=LocalDateTime.now();
        System.out.println(c);
        System.out.println("....................");

        LocalDate d=LocalDate.parse("2025-04-24");
        System.out.println(d);
    }
}
