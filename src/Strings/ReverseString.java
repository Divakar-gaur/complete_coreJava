package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s="pratwish";
        String res="";
        for (int i=s.length();i<=0;i++){
            res+=s.charAt(i);
        }
        System.out.println("Original String "+s);
        System.out.println("Reversed String "+res);
    }
}
