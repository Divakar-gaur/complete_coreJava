package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier4 {
    public static void main(String[] args) {
        String s="a2b54c22d43";
        String exp="[a-z0-9]{2}";

        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}

