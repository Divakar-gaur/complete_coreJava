package abstraction;


abstract class X{
    abstract void m1();
    static void m2(){
        System.out.println("m2()-A");
    }
}
public class test {
    public static void main(String[] args) {
        //X a=new X();  CTE:- WE CAN'T CREATE OBJECT FOR ABSTRACT CLASS
        X.m2();
    }
}
