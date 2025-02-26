package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailValidation {
    public static void main(String[] args) {
        String s="divakar.gaur01@gmail.com";
        String exp="[a-z][a-z0-9\\\\.$]+@gmail[.]com";

        Pattern p=Pattern.compile(exp);
        Matcher m= p.matcher(s);

        if(m.matches()) System.out.println("valid gmail");
        else System.out.println("invalid gmail");
    }
}
