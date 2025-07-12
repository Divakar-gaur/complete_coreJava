package Java8_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(9,8,7,6,5,4,3,2,1,0);
        l.stream().filter(i->i%2==0).forEach(i-> System.out.println(i));
        System.out.println("-----------------------------");
        long a=l.stream().filter(i->i%2==0).count();   // we cant write int or integer because its return type is long.
        System.out.println(a);
        System.out.println("--------------------------");
        List<Integer> res=l.stream().sorted().toList();
        System.out.println(res);
    }
}
