package Strings;

//           INPUT :- JAAAAAVVA          OUTPUT :- J IS 1 TIME

public class MinOccurence {
    public static void main(String[] args) {
        String s = "hhhhcccssss";
        char[] ch = s.toCharArray();
        int count=0;
        int min = 1;
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            count=0;
            if (ch[i]==' ') continue;
            for (int j=0;j<s.length();j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            if(i==0) {
                min=count;
                x=i;
            }
            if(count<min){
                min=count;
                x=i;
            }

        }
        System.out.println(ch[x] + " is occured " + min + " times, which is min.");
    }
}