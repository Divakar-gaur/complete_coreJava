package array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :- ");
        int key=sc.nextInt();
        int [] a = {0,4,6,9,5,3};
        int x=search(a,key);
        if(x==-1){
            System.out.println("number not avaliable");
        }
        else System.out.println("number is present at index "+x);
    }

    public static int search(int [] a, int key){
        int st=0;
        int end=a.length-1;
        while (st<=end){
            int mid=(st+end)/2;
            if(key==a[mid]) return mid;
            else if (key<a[mid]) end=mid-1;
            else if (key>a[mid]) st=mid+1;
        }
        return -1;
    }
}
