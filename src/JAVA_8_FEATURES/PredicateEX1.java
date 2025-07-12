package JAVA_8_FEATURES;

import java.util.function.Predicate;

public class PredicateEX1 {
    public static void main(String[] args) {
        int x=39;
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(x));
    }
}
