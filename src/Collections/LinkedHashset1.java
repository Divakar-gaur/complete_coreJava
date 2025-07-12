package Collections;

import java.util.*;

public class LinkedHashset1 {
    public static void main(String[] args) {
        int[] a = {5, 7, 1, 9, 3, 6, 0};
//        List <Integer>l = new ArrayList();
//        for (int n:a)
//            l.add(n);
//        Collections.sort(l);
//        Set s = new LinkedHashSet();
        Set s=new HashSet();
        for(int n:a)
            s.add(n);
//        System.out.println(l);
        System.out.println(s);
        int max1=0;
        int max2=0;
        Iterator <Integer>i=s.iterator();
        while(i.hasNext()){
            max2=max1;
            max1=i.next();
        }
        System.out.println(max2);
    }
}
