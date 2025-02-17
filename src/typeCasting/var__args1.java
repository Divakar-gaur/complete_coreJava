package typeCasting;

public class var__args1 {
    public static void m1(int i,int j){
        System.out.println("M1(int i,int j) " + i+","+j);
    }
    public static void m1 (int ...a) {
        //System.out.println("m1(int ...a) "+ a[3]);  //ARRAY INDEX OUT OF BOUNDS
        System.out.println(a[0] +","+ a[1] +","+ a[2]);
    }

    public static void main(String[] args) {
        m1(10,20);
        System.out.println("-------------");
        m1(30,40,50);
        System.out.println();
    }
}
