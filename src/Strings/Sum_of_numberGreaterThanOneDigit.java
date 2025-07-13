package Strings;

public class Sum_of_numberGreaterThanOneDigit {
    public static void main(String[] args) {
        String s="123KILHBY123LK.M NJ23";
        String med="";
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                med+=s.charAt(i);
            }
            else{
                if(!med.isEmpty()){
                    sum+=Integer.parseInt(med);
                    med="";
                }
            }
        }
        sum+=Integer.parseInt(med);
        System.out.println(sum);
    }
}
