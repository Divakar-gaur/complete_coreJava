package basic;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isBalanced(s));
    }
    public static boolean isBalanced(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                s1.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (!s.isEmpty()) {
                    char ch1 = s1.pop();
                    if (!pair(ch1, ch))
                        return false;
                }
                else return false;
            }
        }
        return s1.isEmpty();
    }
    public static boolean pair(char ch1,char ch){
        if((ch=='[' && ch1==']')||(ch=='{' && ch1=='}')||(ch=='(' && ch1==')'))
            return true;
        else return false;
    }
}