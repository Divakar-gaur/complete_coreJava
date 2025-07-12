package Java8_StreamAPI;

import java.util.Arrays;

public class RemoveDuplicateUsingArray {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,4,3,2,1};
        int [] b= Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(b));
    }
}
