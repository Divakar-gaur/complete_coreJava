package numbers;

import java.util.Scanner;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        int prod=1;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n/=10;
        }
        if(sum==prod) System.out.println("number is spy");
        else System.out.println("number is not spy");
    }
}

