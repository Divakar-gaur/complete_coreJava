package Strings;

//           INPUT :-  BOSS,BOSSSS             OUTPUT :-   BOS$,BOS$S$

public class AlternateSameCharacterChange {
    public static void main(String[] args) {
        String s="BOSSSSSSSS";
        char [] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if(ch[i]==ch[i+1]){
                ch[i+1]='$';
                i++;
            }
        }
        System.out.println(ch);
    }

}
