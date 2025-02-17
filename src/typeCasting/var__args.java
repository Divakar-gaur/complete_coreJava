package typeCasting;

public class var__args {
    public static void m1 (int ...a){
        for (int n:a){
            System.out.println("M1() IS EXECUTED  " + n);
        }
    }
    public static void m1(String ...S){
        for (String n: S){
            System.out.println("M1() IS EXECUTED  " + n);
        }
    }

    public static void main(String[] args) {
        m1(10,20);
        System.out.println("==============");
        m1(30,40,50);
        System.out.println("------------------");
        m1("Ram");
        System.out.println("+++++++++++++++++++++++++");
        m1("Ram","Sita","Laxman","Hanuman");
    }
}
