package JAVA_8_Method_and_Constructor_Reference;

import java.util.function.Supplier;

class A{
    A(){
        System.out.println("A()-Constructor");
    }
}


public class Constructor_referenceEX1 {
    public static void main(String[] args) {
        Supplier<A> sp=()->new A();
        A a1=sp.get();
        A a3=sp.get();
        A a2=sp.get();
        System.out.println("==================");

        Supplier<A> s=A::new;
        A a5=sp.get();
        A a4=sp.get();
    }
}
