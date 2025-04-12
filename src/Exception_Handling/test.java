package Exception_Handling;

public class test{
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println(s.length());           //     EXCEPTION
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println("handled");
            s="";
        }
        System.out.println(s.length());
    }
}
