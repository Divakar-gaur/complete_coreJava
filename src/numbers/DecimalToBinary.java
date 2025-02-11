package numbers;

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
//         this will print in reverse order
//        while(true){
//            int bit=n%2;
//            System.out.print(bit);
//            n/=2;
//            if(n==0) break;
//        }
//......................................method2...................................................
//        String bin="";
//        while(true){
//            int bit=n%2;
//            bin=bit+bin;
//            n/=2;
//            if(n==0) break;
//        }
//        System.out.println(bin);
//..................................METHOD3.....................................................
        int bin=0;
        int i=1;
        while(n>0){
            int bit=n%2;
            bin=(bit*i)+bin;
            n/=2;
            i*=10;
        }
        System.out.println(bin);
    }
}
