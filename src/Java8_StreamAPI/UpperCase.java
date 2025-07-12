package Java8_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class UpperCase {
    public static void main(String[] args) {
        List<Character> l= Arrays.asList('e','t','b','q');
        l.stream().forEach(i-> System.out.println((char)(i-32)));
    }
}
