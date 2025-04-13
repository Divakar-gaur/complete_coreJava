package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set <String> s=new HashSet();
        s.add("kane mama");
        s.add("dhoni");
        s.add("Mr. 360");
        s.add("tara");

        Iterator <String> i=s.iterator();
        while (i.hasNext()){
            String v=i.next();
            System.out.println(v);

        }
    }
}
