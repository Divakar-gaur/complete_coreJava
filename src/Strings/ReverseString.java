package Strings;

import java.sql.SQLOutput;

public class ReverseString {
    public static void main(String[] args) {
        String s="PRATWISH";
        String res="";
        for(int i=s.length()-1; i>=0;i--){
            res=res+s.charAt(i);
        }
        System.out.println("original string:- " + s);
        System.out.println("reverse string:- " + res);
    }
}
