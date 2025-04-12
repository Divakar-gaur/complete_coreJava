package overloading_overriding_hiding;

// CREATING STATIC METHOD IN SUB CLASS WITH EXACT SAME SIGNATURE AS PARENT---
// ---CLASS STATIC METHOD IS CALLED METHOD HIDING OR METHOD SHADOWING.

class aq{
    void m1(){
        System.out.println("m1-a");
    }
    static void m2(){
        System.out.println("m2-a");
    }
}

class bq extends aq{
    void m1(){
        System.out.println("m1-b");
    }
    static void m2(){
        System.out.println("m2-b");
    }
}
public class method_hiding {
    public static void main(String[] args) {
        bq B=new bq();
        B.m1();    //method overriding
        B.m2();    //method hidingor shadowing
    }

}
