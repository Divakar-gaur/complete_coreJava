package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class list_iterator {
    public static void main(String[] args) {
        List l= Arrays.asList(10,20,30,40,50);
        ListIterator i=l.listIterator(l.size());
        while (i.hasPrevious()){
            System.out.print(i.previous()+" ");
        }
        System.out.println();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
//            System.out.println(i);
        }
    }
}
