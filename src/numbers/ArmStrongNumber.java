package numbers;
//import java.util.Scanner;
//public class numbers.ArmStrongNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("......ARMSTRONG NUMBER...........");
//        System.out.println("enter a number");
//        int n = sc.nextInt();
//        int l = n;
//        int k = n;
//        int sum = 0;
//
//        int digits;
//        for(digits = 0; l > 0; l /= 10) {
//            digits++;
//        }
//
//        System.out.println("total digits = " + digits);
//
//        while(k > 0) {
//            int a = k % 10;
//            int product = 1;
//
//            for(int i = 1; i <= l; ++i) {
//                product *= a;
//            }
//
//            sum += product;
//            k /= 10;
//        }
//
//        if (sum == n) {
//            System.out.println("number is armstrong ");
//        } else {
//            System.out.println("number is not armstrong ");
//        }
//
//    }
//}
import java.util.Scanner;
class ArmStrongNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int k=n;
        int s=n;
        int sum=0;
        int digit=0;
        while(k>0){
            digit++;
            k/=10;
        }
        System.out.println("number of digits is "+digit);

        while(n>0){
            int product=1;
            int a=n%10;
            for(int i=1;i<=digit;i++){
                product*=a;
            }
            sum+=product;
            n/=10;
        }
        if(s==sum) System.out.println("armstrong number");
        else System.out.println("not an armstrong number");
    }
}