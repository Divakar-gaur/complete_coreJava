package numbers;

import java.util.Scanner;
public class IteratingNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        int k;
        while(n>0){
            k=n%10;
            System.out.println(k);
            n/=10;
        }
    }
}