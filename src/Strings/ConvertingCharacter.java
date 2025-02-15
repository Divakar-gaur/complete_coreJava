package Strings;

public class ConvertingCharacter {
    public static void main(String[] args) {
        String s="DiVaKaR";
        char[] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
            else if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
        }
        System.out.println(ch);
    }
}
