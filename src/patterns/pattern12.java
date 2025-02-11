package patterns;

public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==1 || i+j==6) System.out.print("K");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j==1 || i==j) System.out.print("k");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
