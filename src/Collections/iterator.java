package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        List <Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        Iterator<Integer> i = l.iterator();
        while (i.hasNext()){
            int v=i.next();
            System.out.println(v);
//            System.out.println(i);
        }
    }
}
