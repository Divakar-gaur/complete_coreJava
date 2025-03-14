package Two_D_Arrays;

public class SumOfTwoMatric {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{6,5,4},{6,7,4}};
        int [][] b={{2,2,3},{1,2,4},{2,1,4}};
        int [][] c=new int[a.length][a.length];

        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
