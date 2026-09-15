package Queues;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int n = q.size();
        while(n>0){
            st.push(q.remove());
            n--;
        }

        int m = st.size();
        while(m>0){
            q.add(st.pop());
            m--;
        }
        
        System.out.println(q);

    }
}
