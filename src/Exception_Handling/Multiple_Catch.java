package Exception_Handling;

public class Multiple_Catch {
    public static void main(String[] args) {
        String s="tara";
        int n=0;
        try {
            n=Integer.parseInt(s);
        }catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("handled");
        }

        //-------------- these statements are unreachable because exception is already handled by Exception e



//        catch (NumberFormatException e) {
//            System.out.println("NumberFormatException");
//        }
        System.out.println(n);
    }
}
