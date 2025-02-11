package methods;

import java.util.Scanner;

public class all_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to check any number \nPress 2 to get range");
        System.out.println("Press 3 to get highest\nPress 4 to get lowest");
        System.out.println("Press 5 to get 2nd highest\nPress 6 to get alternate prime");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("enter number");
                int k = sc.nextInt();
                System.out.println(isPrime(k));

            case 2:
                System.out.println("enter range");
                int x = sc.nextInt();
                int y = sc.nextInt();
                range(x, y);

            case 3:
                System.out.println("enter range");
                int p = sc.nextInt();
                int q = sc.nextInt();
                highest(p, q);

            case 4:
                System.out.println("enter range");
                int s = sc.nextInt();
                int t = sc.nextInt();
                lowest(s, t);

            case 5:
                System.out.println("enter range");
                int lower = sc.nextInt();
                int upper = sc.nextInt();
                second_highest(lower, upper);

            case 6:
                System.out.println("enter range");
                int m = sc.nextInt();
                int o = sc.nextInt();
                alt_prime(m,o);
        }
        if (n == 5) {

        }
        if (n == 6) {

        }
    }
    public static void alt_prime(int st,int end){
        int count=0;
        for (int i=st;i<=end;i++){
            if (isPrime(i)){
                count++;
                if(count%2==0){
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void lowest(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void highest(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void range(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
    public static void second_highest(int st, int end){
        int count =0;
        for (int i = end; i >= st; i--) {
            if (isPrime(i)) {
                count++;
                if(count==2){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
