package Strings;

public class OccurenceOfSecondMaximumUsingReplace {
    public static void main(String[] args) {
        String s1="jjjjjjavvvvvaadev";
        int max=0;
        char maxchar=' ';
        int max_2=0;
        char maxchar_2=' ';
        while(s1.length()!=0){
            char ch= s1.charAt(0);
            String s2=s1.replace(ch + "","");
            int count= s1.length()-s2.length();
            if(count>max){
                max_2=max;
                maxchar_2=maxchar;
                max=count;
                maxchar=ch;
            } else if (count>max_2 && count!=max) {
                maxchar_2=ch;
                max_2=count;
            }
            s1=s2;
        }
        System.out.println(maxchar + " = " + max);
        System.out.println(maxchar_2 + " = " + max_2);
    }
}
