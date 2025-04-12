package sorting;


import java.lang.reflect.Array;
import java.util.Arrays;

public class merge{
    public static void main(String[] args) {
        int [] a={8,9,5,7,2,4,1,3,6};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void sort(int [] a){
        if(a.length==1) return;
        int [] left=new int[a.length/2];
        int [] right= new int[a.length-left.length];

        for (int i=0;i<left.length;i++){
            left[i]=a[i];
        }

        // ANOTHER COPY METHOD :- System.arraycopy(a,0,left,0,left.length);

        for (int i=0;i<right.length;i++){
            right[i]=a[left.length+i];
        }

        // ANOTHER COPY METHOD :- System.arraycopy(a,left.length,right,0,right.length);

        sort(left);
        sort(right);
        merge(left,right,a);

    }

    public static void merge(int [] a, int [] b, int [] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else c[k++] = b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
