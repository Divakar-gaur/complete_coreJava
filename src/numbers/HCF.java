package numbers;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter both numbers");
        int first = sc.nextInt();
        int second = sc.nextInt();

        int smallest;

        smallest=first>second ? second:first ;
        while  (true){
            if(first % smallest==0  &&  second % smallest==0)
                break;
            smallest--;
        }


        System.out.println("hcf is : " +smallest);
    }
}