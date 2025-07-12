package JAVA_8_FEATURES;

@FunctionalInterface
interface I3{
    int num(char c);
}
public class LambdaChar_TO_Int {
    public static void main(String[] args) {
        I3 i3=c -> (int) c;
        System.out.println(i3.num('*'));
    }
}
