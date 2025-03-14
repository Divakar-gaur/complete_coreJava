package constructor;

public class CallingOneConstWithAnother{

    CallingOneConstWithAnother(){
        System.out.println("no arg constructor");

    }
    CallingOneConstWithAnother(int n){
        this();
        System.out.println("constructor with one arg");
    }

    CallingOneConstWithAnother(int i, int j){
        this(10);
        System.out.println("constructor with two arg");
    }

    public static void main(String[] args) {
        CallingOneConstWithAnother b1=new CallingOneConstWithAnother(100,200);
    }
}
