package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier2 {
    public static void main(String[] args) {
        String s="aabbacadabbbb";
        String exp="ab{0,}";

        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
