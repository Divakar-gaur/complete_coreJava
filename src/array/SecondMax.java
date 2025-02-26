package array;

public class SecondMax {
    public static void main(String[] args) {
        int [] a= {8,3,4,9,2};
        int max1=0;
        int max2=0;
        for (int n:a){
            if(n>max1){
                max2=max1;
                max1=n;
            }
            else if (n>max2 && n!=max1){
                max2=n;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
