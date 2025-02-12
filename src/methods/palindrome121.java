package methods;
import java.util.Scanner;

class palindrome121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to check any number \nPress 2 to get range");
        System.out.println("Press 3 to get alternate\nPress 4 to get highest");
        System.out.println("Press 5 to get lowest");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("enter number");
            int k = sc.nextInt();
            System.out.println(isPalindrome(k));
        }
        if (n == 2) {
            System.out.println("enter range");
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            range(lower, upper);
        }
        if (n == 3) {
            System.out.println("enter range");
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            alt_Palindrome(lower, upper);
        }
        if (n == 4) {
            System.out.println("enter range");
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            highest(lower, upper);
        }
        if (n == 5) {
            System.out.println("enter range");
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            lowest(lower, upper);
        }
    }

    public static boolean isPalindrome(int n) {
        int m = n;
        int rev = 0;
        while (n != 0) {
            int r = n % 10;
            rev = (rev * 10) + r;
            n /= 10;
        }
        if (m == rev) return true;
        else return false;
    }

    public static void alt_Palindrome(int st, int end) {
        int count = 0;
        int altercount = 0;
        for (int i = end; i >= st; i--) {
            if (isPalindrome(i)) {
                count++;
                if (count % 2 == 0) {
                    altercount++;
                    System.out.println(i);
                }
            }
        }
    }

    public static void range(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static void highest(int st, int end) {
        for (int i = end; i >= st; i--) {
            if (isPalindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void lowest(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}