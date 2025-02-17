package Strings;

public class CountingAlphabetsOnly {
    public static void main(String[] args) {
        String s= "JavaDev@123#";
        int count=0;
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch>='a' && ch<='z')) count++;
        }
        System.out.println("Alphabets in given string are "+count);
    }
}
