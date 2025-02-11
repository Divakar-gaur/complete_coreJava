package patterns;

public class pattern22 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(j==5 ||i==5 || i+j==6) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
