package Java8_StreamAPI;

public class RemoveDuplicateCharacters {
    static String res="";
    public static void main(String[] args) {
        String s="jav   ad  ev";
        s.chars().distinct().forEach(i->res+=(char)i);
        System.out.println(res);
    }
}
