package array;

public class OddIndexElements {
    public static void main(String[] args) {
        int [] a = {5,6,3,1,4,8,4,6,7,9};
        for(int i=0;i<a.length;i++){
            if (i%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
