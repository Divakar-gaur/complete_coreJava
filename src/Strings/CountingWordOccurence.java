package Strings;

//    INPUT :- JAVA IS VERY VERY EASY EASY JAVA.          OUTPUT :- JAVA-2, IS-1, VERY-2, EASY-2

public class CountingWordOccurence {
    public static void main(String[] args) {
        String s="JAVA IS VERY VERY EASY EASY JAVA";
        String [] str = s.split(" ");
        int count=0;
        for (int i=0;i< str.length;i++){
            count =1;
            for (int j=i+1;j< str.length;j++){
                if(str[i].equals(str[j])){
                    count++;
                    str[j]="";
                }
            }
            if(str [i]=="") continue;
            else System.out.println(str[i] + " - " + count);
        }
    }
}
