package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingDots {
    public static void main(String[] args) {
        String s="ab.c.s.hy.45.@";
        String exp="[.]";
        int count=0;
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            count++;
            System.out.print(m.group());
        }
        System.out.println();
        System.out.println(count);
    }
}
