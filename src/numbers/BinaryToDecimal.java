package numbers;

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any binary number :");
        int bin=sc.nextInt();
        int sum=0;
        int i=1;
        while (bin>0){
            int bit=bin%10;
            sum+=bit*i;
            bin/=10;
            i*=2;
        }
        System.out.println(sum);
    }
}
