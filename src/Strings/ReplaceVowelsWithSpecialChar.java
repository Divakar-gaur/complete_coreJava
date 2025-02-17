package Strings;

//     INPUT :- java developer         OUTPUT :- j-v- d-v-l-p-r

public class ReplaceVowelsWithSpecialChar {
    public static void main(String[] args) {
        String s = "java developer";
        char [] ch=s.toCharArray();
        String res = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || ch [i]== 'e' || ch [i] == 'i' || ch [i] == 'o' || ch [i] == 'u' || ch [i] == 'A' || ch [i] == 'E' || ch [i] == 'I' || ch [i] == 'O' || ch [i] == 'U') {
                count++;
            }
        }
        System.out.println(count);
        if (count < 3) {
            System.out.println(s);
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                if (ch [i] == 'a' || ch [i]== 'e' || ch [i] == 'i' || ch [i] == 'o' || ch [i] == 'u' || ch [i] == 'A' || ch [i] == 'E' || ch [i] == 'I' || ch [i] == 'O' || ch [i] == 'U') {
                    res+="$";
                    i++;
                }
                res+=ch[i];
            }
        }
        System.out.println(res);
    }
}

