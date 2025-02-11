package numbers;

import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int k=n;
        int sum=0;
        while(n>0){
            int product=1;
            int d=n%10;
            for (int i=1;i<=d;i++){
                product*=i;
            }
            sum+=product;
            n=n/10;
        }
        if(sum==k) System.out.println("number is strong ");
        else System.out.println("number is not strong");
    }
}

