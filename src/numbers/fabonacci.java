package numbers;//import java.util.Scanner;
//public class numbers.fabonacci {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter range");
//        int l= sc.nextInt();
//        int u= sc.nextInt();
//        int a=0;
//        int b=1;
//        int c=0;
//        while(a<=u){
//            if(a>=l) System.out.println(a);
//            c=a+b;
//            a=b;
//            b=c;
//        }
//    }
//}


//import java.util.Scanner;
//class numbers.fabonacci{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number ");
//        int n= sc.nextInt();
//        int a=0;
//        int b=1;
//        int c=1;
//        while(a<=n){
//            System.out.print(a+"  ");
//            c=a+b;
//            a=b;
//            b=c;
//        }
//    }
//}


import java.util.Scanner;
class fabonacci{
    public static void main(String[] args) {
        System.out.println("enter number ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}