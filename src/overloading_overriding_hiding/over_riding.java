package overloading_overriding_hiding;

// overriding is only possible in inheritance.

class A{
    void m1(){
        System.out.println("m1-a");
    }
}

class B extends A{
    void m1(){
        System.out.println("m1-b");
    }
}

public class over_riding {
    public static void main(String[] args) {
        B b=new B();
        b.m1();
    }
}
