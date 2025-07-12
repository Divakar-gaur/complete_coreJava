package Java8_StreamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingElements {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(9,8,7,6,5,5,6,7,8,9,9,6,1,3,1,4,0,4);
        Map<Integer,Long> m=l.stream().collect(Collectors.groupingBy(c->c,()->new LinkedHashMap<>(),Collectors.counting()));
        m.forEach((ch,i)-> System.out.println(ch+"="+i));

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(l.size());
        System.out.println("______________________________");

        int [] a1={9,8,7,6,5,5,6,7,8,9,9,6,1,3,1,4,0,4};
        Arrays.stream(a1).mapToObj(i->i).collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((ch,i)-> System.out.println(ch+"="+i));
    }
}
