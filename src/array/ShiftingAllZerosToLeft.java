package array;

import java.util.Arrays;

public class ShiftingAllZerosToLeft {
    public static void main(String[] args) {
        int [] a = {3,0,2,5,0,0,9};
        int [] b = new int[a.length];
        int j=b.length-1;
        for (int i=a.length-1;i>=0;i--){
            if(a[i]!=0){
                b[j]=a[i];
                j--;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
