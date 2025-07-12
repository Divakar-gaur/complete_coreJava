package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List l= new ArrayList<>();
        l.add(24);
        l.add(34.35);
        l.add("ram");
        l.add('a');
        l.add(64.4f);

        System.out.println(l);

        System.out.println(l.remove(3));
        System.out.println(l.remove(3));
        System.out.println("---------------------");
        System.out.println(l.size());
        System.out.println(l.contains('a'));
        System.out.println(l);


        ArrayList l1=new ArrayList<>();
        l1.addAll(l);
        System.out.println(l1);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.remove(2);
        System.out.println(l1);

        System.out.println(l1.containsAll(l));
        l1.clear();
        System.out.println(l1);
    }
}
