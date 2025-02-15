package typeCasting;

public class NarrowingExample {
    public static void main(String[] args) {
        double d=9.5;
        int n=(int) d;   //narrowing
        System.out.println(d + "  " + n);
        float b= 7.5f;
        long a=(long) b;   //  narrowing
        System.out.println(b + "  " + a);
        int x=130;
        byte c=(byte) x;
        System.out.println("byte c = "+ b);
        System.out.println("int a = " + x);
        int m=50;
        double dd=(double) m;
        System.out.println(m + "  " + dd);
    }
}
