package inheritance;

class C{
    int i;
    int j;
    C(){

    }

    C(int i,int j){
        this.i=i;
        this.j=j;
    }

    public void m1(){
        System.out.println("i= " + i);
        System.out.println("j= " + j);

    }
}

class D extends C{
    int i;
    int j;
    D(int i,int j){
        this.i=i;
        this.j=j;
    }

    public void m2(){
        System.out.println("i= " + i);
        System.out.println("j= " + j);

    }
}

public class test_X {
    public static void main(String[] args) {
        D d1=new D (10,20);
        d1.m1();
        d1.m2();

    }
}
