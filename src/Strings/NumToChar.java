package Strings;

//      INPUT :- 2A3B4C          OUTPUT :- AABBBCCCC

public class NumToChar {
    public static void main(String[] args) {
        String s="2a3b4c";
        String res="";
        char [] ch=s.toCharArray();
        int n;
        for(int i=0;i<s.length();i++){
            n=0;
            if(ch[i]>='0' && ch[i]<='9'){
                n=(int)(ch[i]-'0');
                char c=ch[i+1];
                for (int k=0;k<=n-2;k++){
                    res+=c;
                }
                continue;
            }
            res+=ch[i];
        }
        System.out.println(res);
    }
}
