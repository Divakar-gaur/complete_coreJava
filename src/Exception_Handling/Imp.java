package Exception_Handling;

public class Imp {
    public static void main(String[] args) {
        System.out.println("main starts");
        try {
            System.out.println(10/0);
            System.out.println("try-block");   // this line will run only if no exception occurs.
        }catch (Exception e){
            System.out.println(e);
            System.out.println("handled");
        }
    }
}
