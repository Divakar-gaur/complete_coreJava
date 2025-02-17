package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s="malayalam";

        if (isPalindrome(s)) System.out.println("Given string is palindrome");
        else System.out.println("Given string is not a palindrome");

    }

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
