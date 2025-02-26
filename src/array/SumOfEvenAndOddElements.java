package array;

public class SumOfEvenAndOddElements {
    public static void main(String[] args) {
        int [] a = {5,6,3,1,4,8,4,6,7,9};
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) even+=a[i];
            else odd+=a[i];
        }
        System.out.println("sum of even numbers is : " + even);
        System.out.println("sum of odd numbers is : " +odd);
    }
}
