package typeCasting;

public class WIdeningExample1 {
    public static void main(String[] args) {
        m1(10.5);
        m1(7.5f); //widening
        m1(5); //widening
        m1(10+5.5); //widening
        m1('A'); //widening
        //m1(true);    //CTE
        System.out.println(m2());
    }
    public static void m1(double d){
        System.out.println("m1(double d) : "+d);
    }
    public static double m2(){
        System.out.println("m2() executed");
        return 'A';       //widening
        //return '10';     //widening
        //return '7.5f';   //widening

    }
}
