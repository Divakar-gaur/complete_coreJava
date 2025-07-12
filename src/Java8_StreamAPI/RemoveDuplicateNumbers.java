package Java8_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(9,8,7,6,5,5,6,7,8,9);
        List<Integer> li=l.stream().distinct().toList();
        System.out.println(li);

    }
}
