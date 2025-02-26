package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintingIndianMobNumber {
    public static void main(String[] args) {
        String s="98743214567zgdxhcfvgjb0-9876543256789ilkujyh3456789087098765";
        String exp="[9876][0-9]{9}";

        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}

