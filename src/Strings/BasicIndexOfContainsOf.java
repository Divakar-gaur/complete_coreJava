package Strings;

public class BasicIndexOfContainsOf {
    public static void main(String[] args) {
        String s= "javadev";
        System.out.println(s.indexOf("a"));    //1
        System.out.println(s.indexOf("v"));    //2
        System.out.println(s.indexOf("adev"));   //3
        System.out.println(s.indexOf("J"));    //-1
        System.out.println(s.indexOf("a",2));   //3


        System.out.println(s.contains("a"));   //true
        System.out.println(s.contains("E"));   //false
    }
}
