package typeCasting;

public class NarrowingExample1 {
    public static int m1(){
        return 10;
        //return 9.5;   //CTE    (RETURN TYPE IS FLOAT)
        //return (int) 9.5; //CTS   return type is int
    }
    public static double m2(){
        return 10.5;
    }
    public static void main(String[] args) {
        System.out.println(m1());
        int r=(int) m2();
        System.out.println(r);
    }
}
