package interfaces;

interface I1{
    public static final int i = 10;
    abstract public void m1 ();
    int j=20;    //public static final int j=20;
    void m2();   //public static void m2();
}
public class test {
    public static void main(String[] args) {
        //I1.i=new I1(); // CTE (can't instantiate just like abstraction)
        System.out.println(I1.i);   //10
        System.out.println(I1.j);   //20
        //I1.i=200;   // CTE (already final int)
        //I1.j=400;   // CTE (already final int)

    }
}
