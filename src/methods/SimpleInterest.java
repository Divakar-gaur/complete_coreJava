import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for simple interest calculation :");
        int k= sc.nextInt();
        if(k==1){
            SimpleInterest.SimInt();
        }
        else {
            System.out.println("invalid number ");
        }
    }
    public static void SimInt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle amount");
        int p= sc.nextInt();
        System.out.println("enter rate");
        int r= sc.nextInt();
        System.out.println("enter time in years");
        int t= sc.nextInt();
        int result=(p*r*t)/100;
        System.out.println("interest is "+ result);
    }
}
