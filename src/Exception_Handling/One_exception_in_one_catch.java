package Exception_Handling;

public class One_exception_in_one_catch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        try {
            System.out.println(a[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("handled");
        }
        System.out.println("main ends");
    }
}
