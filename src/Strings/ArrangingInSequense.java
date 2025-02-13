package Strings;
// Example            ORIGINAL:- JavaDev@123#      O/P:- avaevJD123@#
public class ArrangingInSequense {
    public static void main(String[] args) {
        String s= "JavaDev@123#";
        String lc="",uc="",nc="",sp="";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z') uc+=s.charAt(i);
            else if(ch>='a' && ch<='z') lc+=s.charAt(i);
            else if(ch>='0' && ch<='9') nc+=s.charAt(i);
            else sp+=ch;
        }
        System.out.println(lc+uc+nc+sp);
    }
}
