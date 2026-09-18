package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelementsInQueue {

    private static void reverseAtK(Queue<Integer> q,Stack<Integer> st, int index) {
        if(index>q.size() || index<q.size()){
            System.out.println("Invalid index");
        }
        int n = q.size();
        for(int i=1; i<=index; i++){
            st.push(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=1; i<=q.size()-index; i++){
            q.add(q.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        reverseAtK(q,st,3);
        System.out.println(q);
    }

    
}
