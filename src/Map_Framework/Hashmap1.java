package Map_Framework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        String s="banana";
        Map<Character,String> m=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!m.containsKey(ch))
                m.put(ch,i+"");
            else m.put(ch,m.get(ch)+","+i);

        }
        System.out.println(m);
    }
}