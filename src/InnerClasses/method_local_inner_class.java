package InnerClasses;

public class method_local_inner_class {
    public static void main(String[] args) {
        class A{
            public void m1(int a, int b){
                System.out.println("sum is " + (a+b));
            }
        }
        A a=new A();
        a.m1(109,203);
    }
}
