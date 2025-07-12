package Strings;
import java.util.Scanner;


public class Lexical_Order_of_substring {
    public static String getSmallestAndLargest(String s, int k) {
        int n = s.length() - k + 1;
        String[] substrings = new String[n];

        for (int i = 0; i < n; i++) {
            substrings[i] = s.substring(i, i + k);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (substrings[i].compareTo(substrings[j]) > 0) {
                    String temp = substrings[i];
                    substrings[i] = substrings[j];
                    substrings[j] = temp;
                }
            }
        }

        String smallest = substrings[0];
        String largest = substrings[n - 1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

