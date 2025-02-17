package Strings;

//     INPUT :- JAAAAAVVA      OUTPUT :- A IS 6 TIMES

public class MaxOccurence {
    public static void main(String[] args) {
        String s="chhaya sharma";
        char [] ch=s.toCharArray();
        int count;
        int max=1;
        int x=1;
        for (int i=0;i<s.length();i++){
            count=1;
            if (ch[i]==' ') continue;
             for (int j=i+1;j<s.length();j++){
                 if(ch[i]==ch[j]){
                     count++;
                 }
             }
             if(count>max){
                 max=count;
                 x=i;
             }
        }
        System.out.println(ch[x] + " is occured " + max + " times, which is max.");
    }
}
