package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterFollowedByNumber {
    public static void main(String[] args) {
        String s="a1bc2ab33cd5e7c245";
        String exp="[abc][0-9]";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
