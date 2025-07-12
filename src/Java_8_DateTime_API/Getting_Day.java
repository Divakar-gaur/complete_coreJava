package Java_8_DateTime_API;

import java.time.LocalDate;

public class Getting_Day {
    public static void main(String[] args) {
        int month=7;
        int day=21;
        int year=2000;
        //String res = findDay(day, month, year);
        //System.out.println(res);
        findDay(day, month, year);
    }
    public static void findDay(int day, int month, int year) {
        //return LocalDate.of(year, month, day).getDayOfWeek().toString();
        System.out.println(LocalDate.of(year, month, day).getDayOfWeek());
    }
}
