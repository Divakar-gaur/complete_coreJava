package methods;
// CREATING DIFFERENT METHODS WITH SAME NAME AND DIFFERENT ARGUMENTS IS CALLED METHOD OVERLOADING.
public class method_overloading {
    public static void main(String[] args) {
        System.out.println("main starts");
        m1();
        m1(34);
        method_overloading x=new method_overloading();
        x.m1(2,5.5);
        m1("DIVAKAR");
        System.out.println("main ends");
    }
    public static void m1(){
        System.out.println("tnis is m1 method");
    }
    public static void m1(int n){
        System.out.println("this is m1 method with int argument "+n);
    }
    public void m1(int i, double j){
        System.out.println("this is m1 method with int and float arguments "+i+j);
    }
    public static void m1(String S){
        System.out.println("this is m1 method with string arguments "+S);
    }
}
