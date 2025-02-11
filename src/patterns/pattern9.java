package patterns;
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of lines");
        int n= sc.nextInt();
        int sp=0;
        int st=2*n-1;
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= sp; j++) System.out.print("  ");
            for (int j = 1; j <= st; j++) System.out.print("* ");
            System.out.println();
            st-=2;
            sp++;
        }
    }
}
