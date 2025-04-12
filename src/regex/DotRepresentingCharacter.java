package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotRepresentingCharacter {
    public static void main(String[] args) {
        String s="abbabcad162#2gdh";
        String exp="a..a";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
