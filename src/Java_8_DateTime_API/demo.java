package Java_8_DateTime_API;

import java.time.Duration;
import java.time.LocalDateTime;

public class demo {
    public static void main(String[] args) {
        LocalDateTime st=LocalDateTime.of(2000,12,24,11,11);
        LocalDateTime end=LocalDateTime.now();
        Duration d=Duration.between(st,end);

        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
    }
}
