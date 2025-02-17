package abstraction;
abstract class P{
    abstract void m1();
    abstract void m2();
}
abstract class Q extends P{
    @Override
    void m1() {
        System.out.println("M1()-B");
    }
}
class R extends Q{
    @Override
    void m2() {
        System.out.println("M2()-C");
    }
}
public class example1 {
    public static void main(String[] args) {
        // P a=new P();   CTE:- WE CAN'T CREATE OBJECT FOR ABSTRACT CLASS
        P a = new R();
        a.m1();// M1()-B
        a.m2();//M2()-C
        Q b=new R();
        b.m1();// M1()-B
        b.m2();//M2()-C
    }
}
