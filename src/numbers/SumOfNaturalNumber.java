package numbers;//import java.util.Scanner;
//public class numbers.SumOfNaturalNumber {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter number :");
//        int n=sc.nextInt();
//        int sum=0;
//        boolean flag=true;
//        while(true){
//            sum+=n;
//            n--;
//            if (n==0)
//                break;
//        }
//        System.out.println("sum of numbers is "+ sum);
//    }
//}


//.............................................METHOD2.....................................
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number :");
        int n=sc.nextInt();
        String s="";
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            s+=i;
            if (i<n)
                s+="+";
        }
        System.out.println(s+" = "+sum);
    }
}