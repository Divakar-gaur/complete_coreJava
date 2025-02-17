package Strings;

// INPUT :- RAMANA KUMAR             OUTPUT :- N KU

public class UniqueCharacters {
    public static void main(String[] args) {
        String s = "Ramana Kumar";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                res += " ";
                continue;
            }

            boolean isDuplicate = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                res += ch;
            }
        }
        System.out.println(res);
    }
}



//public class UniqueCharacters {
//    public static void main(String[] args) {
//        String s = "RAMANA   KUMAR";  // Input string with multiple spaces
//        String res = "";  // To store the final result
//        boolean lastWasSpace = false;  // Flag to check if the last character was a space
//
//        // Outer loop to iterate over the entire string
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//
//            // If current character is space and last character wasn't a space, add space to result
//            if (currentChar == ' ') {
//                if (!lastWasSpace) {
//                    res += " ";
//                    lastWasSpace = true;  // Set the flag to true
//                }
//                continue;  // Skip further processing for spaces
//            }
//
//            boolean isDuplicate = false;
//
//            // Inner loop to check if the current character is a duplicate
//            for (int j = 0; j < s.length(); j++) {
//                if (i != j && s.charAt(i) == s.charAt(j)) {
//                    isDuplicate = true;
//                    break;  // If we find a duplicate, stop checking further
//                }
//            }
//
//            // If it's not a duplicate, add it to the result string
//            if (!isDuplicate) {
//                res += currentChar;
//            }
//
//            lastWasSpace = false;  // Reset flag if the current character is not a space
//        }
//
//        // Print the final result
//        System.out.println(res);  // OUTPUT: RN KU
//    }
//}

