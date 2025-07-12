package Map_Framework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        Map<Integer,String> m=new LinkedHashMap<>();
        m.put(1,"sweet");
        m.put(5,"honey");
        m.put(2,"place");
        m.put(4,"india");
        m.put(3,"love");

        Set<Map.Entry<Integer,String>> s= m.entrySet();
        for (Map.Entry<Integer,String> e:s)
            System.out.println(e);
    }
}
