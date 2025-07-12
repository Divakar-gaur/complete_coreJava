package Collections;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(23);
        v.add(12);
        v.add(34);
        v.add(45);
        v.add(56);
        v.add(3,101);
        System.out.println(v);
        System.out.println(v.isEmpty());
        System.out.println(v.size());
    }
}
