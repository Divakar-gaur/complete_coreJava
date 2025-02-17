package Strings;

public class abc {
    public static void main(String[] args) {
        String s="hhhhcccssss";
        char [] ch=s.toCharArray();
        int count=0;
        int min=0;
        int x=1;
        for (int i=0;i<s.length();i++) {
            if (ch[i] == ' ') continue;
            for (int j = i + 1; j < s.length(); j++){
                count=1;
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if(min==0 || count<min){
                min=count;
            }
        }
        System.out.println(min);
    }
}
