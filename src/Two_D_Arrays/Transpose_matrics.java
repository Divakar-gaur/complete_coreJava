package Two_D_Arrays;

import java.util.Arrays;

public class Transpose_matrics {
    public static void main(String[] args) {
        int a [][]={{2,4,3},{8,7,4},{1,5,8}};
        int b [][]=new int[a.length][a.length];
        for (int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i]=a[i][j];
            }
        }
        for(int [] n:b)
            System.out.println(Arrays.toString(n));
    }
}

