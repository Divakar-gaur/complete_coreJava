package Strings;
//input :- java is very easy       OUTPUT :- avaj si yrev ysae
public class ReverseWords {
    public static String rev(String s){
        int i=0,j=0;
        String rev="";
        while(j<s.length()){
            while(j<s.length() && s.charAt(j)!=' ') j++;
            int k=j-1;
            while(k>=i){
                rev+=s.charAt(k);
                k--;
            }
            if(j<s.length())
                rev+=" ";
            j++;
            i=j;
        }
        return rev;
    }

    public static void main(String[] args) {
        String s="java is very easy";
        System.out.println(rev(s));
    }
}
