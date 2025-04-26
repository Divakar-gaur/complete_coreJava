package JAVA_8_Method_and_Constructor_Reference;

import java.util.function.Function;

interface I2{
    int square(int i);
}

public class NonStatic_Method_Reference {
    public int m1(int a){
        return a*a;
    }
// static type method
    public static void main(String[] args) {
        I2 i2=i->i*i;
        System.out.println(i2.square(23));

// Non Static type method
        NonStatic_Method_Reference t1=new NonStatic_Method_Reference();
        I2 i=t1::m1;
        System.out.println(i.square(32));

// function type method
        Function<Integer,Integer> fn=t1::m1;
        System.out.println(fn.apply(26));
    }
}
