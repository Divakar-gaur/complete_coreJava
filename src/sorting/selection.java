package sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int [] a={7,0,3,8,1,9};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int [] a){
        for(int i=0;i<a.length-1;i++){
            int index=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j] < a[index]){                // change sign for descending order
                    index=j;
                }
            }
            int temp=a[index];
            a[index]=a[i];
            a[i]=temp;
        }
    }
}
