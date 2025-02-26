package array;

public class max {
    public static void main(String[] args) {
        int [] a = {4,6,9,0,1,4,7,5};
        int max=0;
        for (int n :a){
            if (max<n)
                max=n;
        }
        System.out.println("max element is : "+max);
    }
}
