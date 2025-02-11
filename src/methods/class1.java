//package methods;
//
//public class class1 {
//    public static void main(String[] args) {
//        System.out.println("main starts");
//        m1();
//        final class1 cl=new class1();
//        cl.m2();
//    }
//    public static void m1(){
//        System.out.println("m1 is static method");
//    }
//    public void m2(){
//        System.out.println("m2 is non static method");
//        class1 cs=new class1();
//        cs.m3();
//    }
//    public void m3(){
//        System.out.println("m3 is also non static method");
//    }
//}

//
//class class1{
//    public static void main(String[] args) {
//        class1 cs=new class1();
//        cs.m2();
//        m1();
//    }
//    public static void m1(){
//        class1 cs1=new class1();
//        cs1.m2();
//    }
//    public void m2(){
//        System.out.println("BINGO.....");
//    }
//}

//class class1{
//    public static void main(String[] args) {
//        m1();
//        //m2();  COMPILE TIME ERROR
//        m2(25);
//        //m3();    COMPILE TIME ERROR
//        m3(10,24.4f);
//    }
//    public static void m1(){
//        System.out.println("m1 starts");
//    }
//    public static void m2(int i){
//        System.out.println("m2(int i) : "+i);
//    }
//    public static void m3(int i,float f){
//        System.out.println("m3 (int i,float f) : "+i+","+f);
//    }
//}



class class1{
    public static void main(String[] args) {
        System.out.println("main starts");
        class1 cl=new class1();
        cl.m1();
        m2();
        m3();
        System.out.println("main ends");
    }
    void m1(){
        System.out.println("m1 starts");
        m3();
    }
    static void m2(){
        System.out.println("this is m2 method");
        class1 cs=new class1();
        cs.m1();
    }
    public static void m3(){
        System.out.println("this is m3 method");
    }
}