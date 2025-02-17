package abstraction;

public class ConstructorExample {
    public static void main(String[] args) {
        new CC();
    }
}
abstract class AA{
    AA(){
        System.out.println("AA()-CONSTRUCTOR");
    }
}
abstract class BB extends AA{

}
class CC extends BB{
    CC(){
        System.out.println("CC()-CONSTRUCTOR");
    }
}
