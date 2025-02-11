package numbers;//import java.util.Scanner;
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number :");
//        int n=sc.nextInt();
//        int product=1;
//        for (int i=n;i>=1;i--){
//            product*=i;
//        }
//        System.out.println("numbers.factorial is "+product);
//    }
//}



//..........................................METHOD2..................................




import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        String s="";
        long product=1;
        for (int i=1;i<=n;i++){
            product*=i;
            s+=i;
            if (n>i)
                s+="*";
        }
        System.out.println(s+"="+product);
    }
}