package Exception_Handling;

public class Nested_try {
    public static void main(String[] args) {
         int [] a={1,2,3,4};
         try {
             System.out.println("outer try");
//             System.out.println(a[1]/0);
             try {
                 System.out.println("inner try");
                 System.out.println(a[1]/0);
             }catch (ArrayIndexOutOfBoundsException e){
                 System.out.println("inner catch");
             }
         }catch (ArithmeticException e){
             System.out.println(e);
             System.out.println("outer catch");
         }
    }
}
