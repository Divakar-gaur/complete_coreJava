package Strings;

public class BasicReplace {
    public static void main(String[] args) {
        String s="ramana";
        s=s.replace("a","@");
        System.out.println(s);


        String s2="java is very easy";
        s2=s2.replace(" ","");
        System.out.println(s2);



        String s3 ="ra1ma2na3";
        s3=s3.replaceAll("[0-9]","");
        System.out.println(s3);

        String s4 ="ra1ma2na3";
        s4=s4.replaceAll("[a-z]","");
        System.out.println(s4);
    }
}
