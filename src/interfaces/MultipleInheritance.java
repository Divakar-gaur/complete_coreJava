package interfaces;

interface I{
    void m1();
}
interface I11{
    void m1();
}
class A{
    public void m1(){
        System.out.println("m1()-A");
    }
}
class C extends A implements I,I11{

}

public class MultipleInheritance {
    public static void main(String[] args) {
        I i = new C();
        i.m1();   //m1()-A
        I11 i1=new C();
        i1.m1();   //m1()-A
    }
}
