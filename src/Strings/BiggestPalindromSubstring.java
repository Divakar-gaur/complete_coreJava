package Strings;

public class BiggestPalindromSubstring {
    public static void main(String[] args) {
        String s="malayalam";
        String bigsubpalindrom ="";
        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<s.length();j++){
                String str=s.substring(i,j);
                if(ispalindrom(str)){
                    System.out.println(str);
                    if(str.length()> bigsubpalindrom.length()){
                        bigsubpalindrom =str;
                    }
                }
            }
        }
        System.out.println(":::::::::::::::::::::");
        System.out.println(bigsubpalindrom);
    }
    public static boolean ispalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
