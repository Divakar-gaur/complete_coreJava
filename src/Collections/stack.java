package Collections;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(12);
        s.push(22);
        s.push(32);
        s.push(42);
        s.push(52);

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.size());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(s.isEmpty());
    }
}
