package binding_examples;

class AAA{
    static int i=10;
    int j=20;
    static void m1(){
        System.out.println("m1()-a");
    }
    final void m2(){
        System.out.println("m2()-a");
    }
    void m3(){
        System.out.println("m3()-a");
    }
}

class BBB extends AAA{
    static int i=30;
    int j=40;
    static void m1(){
        System.out.println("m1()-b");
    }

    @Override
    void m3(){
        System.out.println("m3()-b");
    }
}
public class late_ex2 {
    public static void main(String[] args) {
        AAA a=new BBB();
        System.out.println(a.i);
        System.out.println(a.j);
        a.m1();
        a.m2();
        a.m3();
    }
}
