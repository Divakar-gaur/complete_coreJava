package array;

import org.w3c.dom.ls.LSOutput;

public class SecondMin {
    public static void main(String[] args) {
        int [] a = {8,3,4,9,2};
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int n: a){
            if(n<min1){
                min2=min1;
                min1=n;
            }
            else if (n<min2 && n!=min1){
                min2=n;
            }
        }
        System.out.println("min is "+ min1);
        System.out.println("Second min is " + min2);
    }
}
