import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number :");
        int n= sc.nextInt();
        int sp = n-1;
        int st=1;
        for (int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=sp ; j++){
                System.out.print(" ");
            }
            for (int j=1 ; j<=st ; j++){
                if(j==1 || i==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("");
                }
            }
            System.out.println();
            sp--;
            st++;
        }
    }
}
