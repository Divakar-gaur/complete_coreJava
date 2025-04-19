package Map_Framework;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> t=new TreeMap<>();
        t.put("kohli",18);
        t.put("dhoni",7);
        t.put("rahul",1);
        t.put("rohit",45);
        t.put("rinku",9);

        System.out.println(t);

    }
}
