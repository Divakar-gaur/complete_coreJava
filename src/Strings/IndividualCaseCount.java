package Strings;

public class IndividualCaseCount {
    public static void main(String[] args) {
        String s="JavaDev@123#*";
        int uc=0,lc=0,nc=0,sp=0;
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z') uc++;
            else if(ch>='a' && ch<='z') lc++;
            else if(ch>='0' && ch<='9') nc++;
            else sp++;
        }
        System.out.println("Upper Case letters "+uc);
        System.out.println("lower Case letters "+lc);
        System.out.println("numbers "+nc);
        System.out.println("Special Characters "+sp);
    }
}
