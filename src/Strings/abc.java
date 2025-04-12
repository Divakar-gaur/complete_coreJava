package Strings;

public class abc {
    public static void main(String[] args) {
        String s = "ramana";
        int count = 0;

        // Loop through the string using index
        for (int i = 0; ; i++) {
            // Check if we reached the null character or the end of the string
            if (s.charAt(i) == '\u0000') {
                break;  // Exit the loop when we reach the end (null character)
            }
            count++;  // Count valid characters
        }

        // Print the result
        System.out.println(count);  // Output will be 6
    }
}
