package Exception_Handling;

public class Unchecked_Exception {
    public static void main(String[] args) {
        System.out.println("main starts");
        try{
            m1();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("handled");
        }
        System.out.println("main ends");
    }
    public static void m1(){
        System.out.println("m1 starts");
        m2();
        System.out.println("m1 ends");
    }
    public static void m2(){
        System.out.println("m2 starts");
        System.out.println(10/0);
        System.out.println("m2 ends");
    }
}
