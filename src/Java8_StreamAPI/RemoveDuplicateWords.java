package Java8_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateWords {
    static String res="";
    public static void main(String[] args) {
        String s="I LOVE JAVA JAVA LOVE ME";
        String [] str=s.split(" ");
        List<String> li= Arrays.asList(str);
        li.stream().distinct().forEach(i->res+=i+" ");
        System.out.println(res.trim());
    }
}
