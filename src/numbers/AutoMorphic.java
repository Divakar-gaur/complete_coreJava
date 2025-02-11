package numbers;//import java.util.Scanner;
//
//public class numbers.AutoMorphic {
//    public numbers.AutoMorphic() {
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number");
//        int n = sc.nextInt();
//        int k=n;
//        int sq = n * n;
//
//        boolean flag;
//        for(flag = true; n > 0; ) {
//            if (n % 10 != sq % 10) {
//                flag = false;
//                break;
//            }
//            n /= 10;
//            sq /= 10;
//        }
//
//        if (flag) {
//            System.out.println("yes, "+k+" is an Automorphic number");
//        } else {
//            System.out.println("not an automorphic number");
//        }
//
//    }
//}



import java.util.Scanner;
public class AutoMorphic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number :");
        int n=sc.nextInt();
        int sq=n*n;
        boolean flag=true;
        while (n>0){
            if(n%10==sq%10) {
                n/=10;
                sq/=10;
                continue;
            }
            else flag=false;
            n/=10;
        }
        if(flag==true) System.out.println("Given number is automorphic");
        else System.out.println("not an automorphic number");
    }
}
