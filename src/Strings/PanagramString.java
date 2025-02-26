package Strings;

public class PanagramString {
    public static void main(String[] args) {
        String s= "A quick brown fox jumps over the lazy dog";
        if(ispanagram(s)) System.out.println("true");
        else System.out.println("false");
    }
    public static boolean ispanagram(String s){
        if(s.length()<26) return false;
        //s=s.toLowerCase();
        for (char ch='a';ch<='z';ch++){
            if(!s.contains(ch+"")){
                return false;
            }
        }
        return true;
    }
}
