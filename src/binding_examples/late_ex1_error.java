package binding_examples;

class AA{
}

class BB extends AA{
}

class CC{
    void m1(AA a){
        System.out.println("m1(AA-a)-CC");
    }
    void m1(BB b){
        System.out.println("m1(BB-b)-CC");
    }
}

class DD extends CC{

    void m1(AA a){
        System.out.println("m1(AA-a)-DD");
    }
    void m1(BB b){
        System.out.println("m1(BB-b)-DD");
    }
}

public class late_ex1_error {
    public static void main(String[] args) {
        AA a=new AA();
        BB b=new BB();
        AA i=new BB();
        CC j=new DD();

    }

}