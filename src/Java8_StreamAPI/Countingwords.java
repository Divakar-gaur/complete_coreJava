package Java8_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Countingwords {
    public static void main(String[] args) {
        String s="I LOVE JAVA JAVA LOVE ME";
        String [] str=s.split(" ");
        List<String> l= Arrays.asList(str);
        Map<Object,Long> m=l.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
        m.forEach((ch,i)-> System.out.println(ch+"="+i));

    }
}
