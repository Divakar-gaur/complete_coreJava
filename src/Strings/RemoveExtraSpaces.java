package Strings;
             //   INPUT :- JAVA    IS   EASY.               OUTPUT :- JAVA IS EASY.
public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String s="JAVA    IS   EASY ";
        String res="";
        char [] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if(ch[i]==' '){
                if(ch[i + 1] == ' ')
                    continue;
                res+=ch[i];
                i++;
            }
            res+=ch[i];   
        }
        System.out.println(res);
    }
}
