package Exception_Handling;

// EXECUTED EVERY TIME IF EXCEPTION OCCURS OR NOT.

public class finally_ex {
    public static void main(String[] args) {
        System.out.println("DB OPEN");
        try {
            System.out.println("data transfer");
            System.out.println(10/0);
            return;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("handle");
        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//            System.out.println("handle");
//        }
        finally {
            System.out.println("DB CLOSED");
        }
    }
}
