package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :-");
        int key=sc.nextInt();
        int [] a = {9,6,2,8,1,0,9};
        for(int i=0;i<a.length;i++){
            if(a[i]==key)
                System.out.println("number is present at index " + i);
        }
    }
}
