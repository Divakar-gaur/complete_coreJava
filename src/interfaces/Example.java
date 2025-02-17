package interfaces;

interface I3{
    void m1();
    void m3();
}
interface I4 extends I3{
    @Override
    void m1();
    void m2();
}
abstract class AA{
    abstract public void m1();
    public void m2(){
        System.out.println("m2()-AA");
    }
}
class BB extends AA implements I4{
    @Override
    public void m1() {
        System.out.println("m1()-BB");
    }

    @Override
    public void m3() {
        System.out.println("m3()-BB");
    }
}

public class Example {
    public static void main(String[] args) {
        I3 i =new BB();
        i.m1();
        i.m3();
    }
}
