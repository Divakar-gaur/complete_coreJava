package inheritance;

class A{
    int i=10;
    void m1(){
        System.out.println("m1()-A");
    }
}

class B extends A{
    int j=20;
}

public class test {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.i);
        System.out.println(b.j);
        b.m1();

        A a=new A();
        System.out.println(a.i);
        //System.out.println(a.j);       //CTE
        a.m1();
    }
}
