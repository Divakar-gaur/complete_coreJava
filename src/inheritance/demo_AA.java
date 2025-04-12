package inheritance;

class AA{
    int i=10;
}

class BB extends AA{
    public void m1(){
        i+=20;
    }
}

public class demo_AA {
    public static void main(String[] args) {
        BB b=new BB();
        System.out.println(b.i);
        b.m1();
        System.out.println(b.i);
        AA a=new AA();
        System.out.println(a.i);

    }
}
