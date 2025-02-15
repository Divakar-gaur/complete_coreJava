package abstraction;
abstract class A{
    abstract void m1();
}
class B extends A{
    void m1(){
        System.out.println("m1()-B");
    }
}
class C extends A{
    public void m1(){
        System.out.println("M1()-C");
    }
}
public class example {
    public static void main(String[] args) {
        //A a=new A();  CTE:- WE CAN'T CREATE OBJECT FOR ABSTRACT CLASS
        A a;
        a=new B();
        a.m1(); // M1()-B
        a=new C();
        a.m1(); // M1()-C
    }
}
