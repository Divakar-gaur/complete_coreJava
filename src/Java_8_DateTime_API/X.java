package Java_8_DateTime_API;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class X {
    public static void main(String[] args) {
        ZonedDateTime a=ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(a);
        System.out.println(",,,,,,,,,,,,,,,,,,");

        ZonedDateTime b=ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(b);

    }
}
