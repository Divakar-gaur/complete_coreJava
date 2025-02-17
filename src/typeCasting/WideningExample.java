package typeCasting;

public class WideningExample {
    public static void main(String[] args) {
        byte b=50;
        int a=b;
        System.out.println(a+"  "+b);//50  50
        char ch='A';
        int n=ch;
        int n1='a';
        System.out.println(n1);
        System.out.println(ch+"  "+ n);
        int n2=7;
        double d=n2;
        System.out.println(n2+"  "+ d);
    }
}
