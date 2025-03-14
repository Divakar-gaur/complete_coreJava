package constructor;

public class CopyConst_Ex1 {
    public static void main(String[] args) {
     A a1=new A(10,20);
     A a2=new A(a1);
        System.out.println(a1.i);
        System.out.println(a1.j);
        System.out.println(a2.i);
        System.out.println(a2.j);
    }
}

class A{
    int i;
    int j;
    public A(int i,int j){
        this.i=i;
        this.j=j;
    }
    A(A a1){
        this.i=a1.i;
        this.j=a1.j;
    }
}
