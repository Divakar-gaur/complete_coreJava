package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Important {
    public static void main(String[] args) {
        String s="ABCa@!@#`123";
        String exp="(?=.*[a-z])";

        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        System.out.println(m.find());
    }
}


//        At least one lower case ->   (?=.*[a-z])

//        At least one upper case ->   (?=.*[A-Z])

//        At  least  one  number  ->   (?=.*[0-9])