package Two_D_Arrays;

public class S_diagonalSum {
    public static void main(String[] args) {
        int a [][]={{2,4,3},{8,7,4},{1,5,8}};
        int sum=0;
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i+j==2) sum+=a[i][j];
            }
        }
        System.out.println("sum of diagonal is " + sum);
    }
}
