package JAVA_8_Method_and_Constructor_Reference;

import java.util.function.Function;

interface I1{
    public void add(int a,int b);
}

public class Static_method_reference {
    public static void m1(int i,int j){
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        I1 i1=Static_method_reference::m1;
        i1.add(21,34);

//string to integer

        Function<String,Integer> fn=Integer::parseInt;
        System.out.println(fn.apply("40"));
    }
}
