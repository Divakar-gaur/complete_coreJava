package Collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList();
        l.add("RAM");
        l.add("SITA");
        l.add("HANUMAN");
        l.add("LAKSHMAN");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
    }
}
