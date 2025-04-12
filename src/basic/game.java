package basic;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name : ");
        String name=sc.next();
        int r_num=(int)(Math.random()*10)+1;
        int score =0;
        int k=3;
        System.out.println("you have 3 chances ");
        for(int i=1;i<=3;i++){
            System.out.println("guess number :-");
            int num=sc.nextInt();
            if(r_num==num){
                System.out.println("correct guess");
                score+=10;
                k-=1;
            }
            else {
                k-=1;
                System.out.println("wrong guess, " + k + " chances left");
            }
            if (k==0) break;
        }
        System.out.println("your score is " + score);
    }
}
