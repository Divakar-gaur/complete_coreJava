package final_keyword;

class A{
    final int i=20;
    void m1(){
        System.out.println("m1-a");
    }

    final static void m2(){
        System.out.println("m2-a");
    }
}

final class B extends A{
    @Override
    public final void m1(){
        System.out.println("m1-b");
    }
}

class C extends A{
    //static void m2(){
        // CAN'T HIDE FINAL STATIC METHOD.
    //}
}

//class D extends B{
    //CTE BECAUSE B IS A FINAL CLASS
//}
public class final_class {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.i);
        b.m1();
        b.m2();
    }
}
