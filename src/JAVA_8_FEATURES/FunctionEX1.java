package JAVA_8_FEATURES;

import java.util.function.Function;

public class FunctionEX1 {
    public static void main(String[] args) {
        int n=5;
        Function<Integer,Integer> fn=i->i*i;
        System.out.println(fn.apply(n));
    }
}
