package JAVA_8_FEATURES;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierEX1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Supplier<Emp> sp=()->new Emp(sc.next(),sc.nextInt(),sc.nextInt());
        Emp e1=sp.get();
        Emp e2=sp.get();
        System.out.println(e1);
        System.out.println(e2);
    }
}
