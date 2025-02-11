package numbers;

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to check:");
//        int n = sc.nextInt();

//        if (n <= 1) {
//            System.out.println("Number is not numbers.prime");
//        } else {
//            boolean isPrime = true;
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                    System.out.println("Number is not numbers.prime");
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println("Number is numbers.prime");
//            }
//        }
        // .........................................................PRIME NUMBER IN RANGE...................................
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter range");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        for(int i=a;i<=b;i++){
//            if(i<=1) continue;
//            boolean flag=true;
//            for(int j=2;j<=i/2;j++){
//                if (i%j==0){
//                    flag=false;
//                    break;
//                }
//
//            }
//            if(flag==true) System.out.println(i);
//        }
        //.............................................................largest numbers.prime number in the range............................
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter preffered range ");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        for (int i=b;  ;i--){
//            if(i<=1) continue;
//            boolean flag=true;
//            for (int j=2;j<=i/2;j++){
//                if(i%j==0){
//                    flag=false;
//                    break;
//                }
//                }
//            if(flag==true){
//                System.out.println("Largest numbers.prime number in this range is : "+i);
//                break;
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a;i<=b; i++) {
            if (i <= 1) continue;
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                if (count % 2 == 0) System.out.println(i);
            }
        }
    }
}