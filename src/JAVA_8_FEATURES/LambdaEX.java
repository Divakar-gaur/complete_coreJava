package JAVA_8_FEATURES;

@FunctionalInterface
interface I1 {
    void m1(int i);
}

public class LambdaEX {
    public static void main(String[] args) {
        I1 i1 = i -> System.out.println("m1() is executed " + i);
        i1.m1(10);
        i1.m1(20);
        i1.m1(40);
    }
}
