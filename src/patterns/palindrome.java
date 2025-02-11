package patterns;

public class palindrome {
    public static void main(String[] args) {
        int n=121;
        int m=n;
        int rev=0;
        while (n!=0){
            int r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        if (m==rev) System.out.println("given number is palindrome");
        else System.out.println("not a palindrome number");
    }
}
