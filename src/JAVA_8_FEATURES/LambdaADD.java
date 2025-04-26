package JAVA_8_FEATURES;

@FunctionalInterface
interface I2{
    int add(int i,int j);
}

public class LambdaADD {
    public static void main(String[] args) {
        I2 i2=(a,b)->a+b;
        System.out.println(i2.add(40,50));
        System.out.println(i2.add(21,45));
    }
}
