package Exception_Handling;

public class Multiple_exception_in_one_catch {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        try {
            System.out.println(a[4]/0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("handled");
        }
    }
}
