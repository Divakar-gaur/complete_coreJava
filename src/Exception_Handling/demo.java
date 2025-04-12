package Exception_Handling;

//in java, every exception has a class

public class demo {
    public static void main(String[] args) {
        System.out.println("main starts");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("handled");
        }
        System.out.println("main ends");
        System.out.println(10/0.0);
        System.out.println(10%0.0);
    }
}
