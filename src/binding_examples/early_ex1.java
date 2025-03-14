package binding_examples;

// CONNECTING METHOD CALL TO ITS METHOD IMPLEMENTATION IS CALLED BINDING.
//A METHOD CALL BIND TO ITS METHOD IMPLEMENTATION AT COMPILE TIME BY COMPILER---
//--- BASED ON METHOD NAME AND ARGUMENT IS CALLED EARLY BINDING.


class A{
    static void m1(){
        System.out.println("m1-A");
    }
    static void m1(int i){
        System.out.println("m1(int i)-A");
    }
}

class B extends A{
    static void m1(){
        System.out.println("m1-B");
    }
    static void m1(int i){
        System.out.println("m1(int i)-B");
    }
}

public class early_ex1 {
    public static void main(String[] args) {
        A a=new B();
        a.m1();
        a.m1(10);
    }
}
