import java.util.Scanner;
class Num_Pattern19 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter number");
                int n= sc.nextInt();
                for ( int i=1 ; i<=n ; i++ ) {
                        if(i%2!=0){
                                int k=n*i-(n-1);
                                for (int j=1;j<=n;j++){
                                        System.out.print(k+"\t");
                                        k++;
                                }
                        }
                        else {
                                int k=n*i;
                                for (int j=1;j<=n;j++){
                                        System.out.print(k + "\t");
                                        k--;
                                }
                        }
                        System.out.println();
                }
        }
}
