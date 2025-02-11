package numbers;

import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter both numbers ");
        int first=sc.nextInt();
        int second=sc.nextInt();
        int largest=first>second ? first:second;
        int i=largest;
        while(true){
            if(largest%first==0 && largest%second==0){
                break;
            }
            largest+=i;
        }
        System.out.println("lcm is " + largest);
    }
}

