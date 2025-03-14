package inheritance;

class Aa{
    Aa(){
        System.out.println("A()");
    }
    Aa(int i){
        System.out.println("A(int i)");
    }
}

class Bb extends Aa{
    Bb(){
        System.out.println("A()");
    }
    Bb(int i){
        System.out.println("A(int i)");
    }
}

class Cc extends Bb{
    Cc(){
        System.out.println("A()");
    }
    Cc(int i){
        System.out.println("A(int i)");
    }
}
public class test_1 {
    public static void main(String[] args) {
        Cc c1 = new Cc();
    }
}
