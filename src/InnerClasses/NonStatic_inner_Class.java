package InnerClasses;

public class NonStatic_inner_Class {
    static int i=10;
    private int j=20;

    public static void main(String[] args) {
        NonStatic_inner_Class a=new NonStatic_inner_Class();
        NonStatic_inner_Class.B b=a.new B();
        b.m1();
    }


    class B{
        void m1() {
            System.out.println(i);
            System.out.println(j);
        }
    }

}
