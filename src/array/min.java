package array;

public class min {
    public static void main(String[] args) {
        int [] a = {5,6,3,1,7,9};
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(min>a[i]) min=a[i];
        }
        System.out.println("min element is : " + min);
    }
}
