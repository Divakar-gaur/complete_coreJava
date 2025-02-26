package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIndianMobNumber {
    public static void main(String[] args) {
        String s="9084395891";
        String exp="[9876][0-9]{9}";

        Pattern p=Pattern.compile(exp);
        Matcher m= p.matcher(s);

        if(m.matches()) System.out.println("valid number");
        else System.out.println("invalid number");
    }
}
