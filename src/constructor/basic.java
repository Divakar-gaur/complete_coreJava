package constructor;

public class basic {
    basic(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        new basic();
        new basic();

    }
}