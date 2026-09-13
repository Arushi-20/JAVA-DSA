package Queues;

import java.util.*;
import java.util.LinkedList;

public class BasicSTLOfQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        // q.poll();
        // System.out.println(q.poll());
        System.out.println(q.size()+" "+q);
        System.out.println(q.peek()+" "+q);
        System.out.println(q.poll()+" "+q);
        System.out.println(q.remove()+" "+q);

    }
}

