package constructor;

class x{
    {
        System.out.println("non static block-x");
    }
    static {
        System.out.println("static block-x");
    }
    x(){
        System.out.println("x-constructor");
    }
}

class y extends x{
    {
        System.out.println("non static block-y");
    }
    static {
        System.out.println("static block-y");
    }
    y(){
        System.out.println("y-constructor");
    }
}

public class blocks {
    public static void main(String[] args) {
        y a1=new y();
    }
}
