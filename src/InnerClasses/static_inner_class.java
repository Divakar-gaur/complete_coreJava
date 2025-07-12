package InnerClasses;

public class static_inner_class {
    int i=10;
    static class A{
        int i=20;
        public static void main(String[] args) {
            System.out.println("main method of A");
        }
        void m1(){
//            System.out.println(new static_inner_class().getClass());
            System.out.println(new static_inner_class().i);
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("main method of static_inner_class");
//        A a  = new static_inner_class.A();
        static_inner_class.A a  = new static_inner_class.A();
        a.m1();
    }
}
