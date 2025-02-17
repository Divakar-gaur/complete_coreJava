package Strings;

//           INPUT :-   MADAM SIR MADAM AUNTY          OUTPUT :-   MADAM MADAM
public class PalindromeWordsPrinting {
    public static void main(String[] args) {
        String s="MADAM SIR MADAM AUNTY";
        String [] str=s.split(" ");
        String res="";
        for (int i=0;i< str.length;i++){
            if(ispalindrom(str[i])){
                res+=str[i];
                res+=" ";
            }

        }
        System.out.println(res.trim());
    }
    public static boolean ispalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
