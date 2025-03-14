package inheritance;

class AAA{
    int i=10;
    void m1(){
        i+=20;
    }
}

class BBB extends AAA{
    int j=20;
    public void m2(){
        System.out.println(i + " , " + j);
        i+=50;
    }
}

public class test_AA {
    public static void main(String[] args) {
        BBB b=new BBB();
        b.m2();
        b.m1();
        b.m2();
        System.out.println(b.i);
    }
}
