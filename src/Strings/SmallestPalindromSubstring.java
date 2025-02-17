package Strings;

public class SmallestPalindromSubstring {
    public static void main(String[] args) {
        String s="malayalam";
        String smallsubpalindrom="";
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<=s.length();j++){
                String str=s.substring(i,j);
                if(ispalindrom(str)){
                    if(flag) smallsubpalindrom=str;
                    flag=false;
                    System.out.println(str);
                    if(str.length()<smallsubpalindrom.length()){
                        smallsubpalindrom=str;
                    }
                }
            }
        }
        System.out.println(":::::::::::::::::::::");
        System.out.println(smallsubpalindrom);
    }
    public static boolean ispalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
