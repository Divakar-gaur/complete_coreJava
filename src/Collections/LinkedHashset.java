package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
    public static void main(String[] args) {
        int [] a={5,7,1,9,3,6,0};
        Set s=new LinkedHashSet();
        for(int n: a)
            s.add(n);
        System.out.println(s);
    }
}
