package overloading_overriding_hiding;

class A1{
    void m1(){
        System.out.println("m1-A1");
    }
}

class B1 extends A1{
    void m1(){
        super.m1();
        System.out.println("m1-B1");
    }
}

public class overriding_ex {
    public static void main(String[] args) {
        B1 b=new B1();
        b.m1();
    }
}
