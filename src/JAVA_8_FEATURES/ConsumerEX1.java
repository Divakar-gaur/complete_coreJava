package JAVA_8_FEATURES;

import java.util.function.Consumer;

public class ConsumerEX1 {
    public static void main(String[] args) {
        Consumer<String> cs=i-> System.out.println("the name is "+i);
        cs.accept("king");
        cs.accept("dhoni");
        cs.accept("CSK");
    }
}
