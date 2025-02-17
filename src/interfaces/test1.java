package interfaces;

interface I2{
    void m1();
}
class B implements I2{
    @Override
    public void m1() {
        System.out.println("m1()-B");
    }
    void m2(){
        System.out.println("m2()-B");
    }
}

public class test1 {
    public static void main(String[] args) {
        I2 i=new B();
        i.m1();
        //i.m2();  //CTE
        B b= (B) i;
        b.m1();
        b.m2();
    }
}
