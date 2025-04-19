package InnerClasses;


class A{
    public void m1(){
        System.out.println("hello PRANAV");
    }
}
public class Anonymous_class {
    public static void main(String[] args) {
        A obj=new A(){
            public void m1(){
                System.out.println("qwerty");
            }
        };
        obj.m1();
    }

}
