package Strings;

public class RemovingDuplicateCharUsingContains {
    public static void main(String[] args) {
        String s="javadev";
        String s2="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s2.contains(ch + "")) continue;
            else s2+=ch;
        }
        System.out.println(s2);
    }
}
