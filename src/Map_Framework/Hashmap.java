package Map_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(18, "goat");
        m.put(07, "THALA");
        m.put(45, "hitman");
        m.put(1, "kl");
        m.put(17, "mr360");

        System.out.println(m);

        Set<Integer> s = m.keySet();
        System.out.println(s);

        Iterator<Integer> i = s.iterator();
        while (i.hasNext()) {
            Object k = i.next();
            Object v = m.get(k);
            System.out.println(k + "=" + v);
        }
    }
}
