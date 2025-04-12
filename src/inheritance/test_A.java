package inheritance;

class aa{
    int i=10;
}

class bb extends aa{
    int i=20;
    public void display(){
        System.out.println(this.i);
        System.out.println(super.i);
        System.out.println(i);
    }
}

public class test_A {
    public static void main(String[] args) {
        bb B=new bb();
        B.display();
    }
}
