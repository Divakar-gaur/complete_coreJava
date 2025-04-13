package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue <Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println("---------------------");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println(q.isEmpty());

    }
}
