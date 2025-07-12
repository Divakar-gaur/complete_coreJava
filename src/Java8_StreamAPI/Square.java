package Java8_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Square {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        List<Integer> li = l.stream().map(i -> i * i).toList();
        System.out.println(li);
    }
}
