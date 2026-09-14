package Queues;

import java.util.*;

public class TraverseInQueue {


    private static void display(Queue<Integer> q){
        int n = q.size();
        for(int i=1; i<=q.size(); i++){
            System.out.print(q.peek()+" ");
            q.add(q.poll());
        }
        System.out.println();
    }


    private static void addAtIndex(Queue<Integer> q, int index, int value) {
        if(index<0 || index>q.size()){
            System.out.println("invalid index");
            return ;
        }
        int n = q.size();
        for(int i=1; i<=index; i++){
            q.add(q.remove());
        }
        q.add(value);
        for(int i=1;i<=n-index; i++){
            q.add(q.remove());
        }
    }


    private static int peekAtIndex(Queue<Integer> q,int index){
        int n = q.size();
        for(int i=1; i<=index; i++){
            q.add(q.remove());
        }
        System.out.println(q.peek());
        for(int i=1; i<=n-index; i++){
            q.add(q.remove());
        }
        return -1;
    }


    private static int remove(Queue<Integer> q,int index){
        int n = q.size();
        for(int i=1; i<=index; i++){
            q.add(q.remove());
        }
        System.out.println(q.poll());
        for(int i=1; i<=q.size()-index; i++){
            q.add(q.remove());
        }
        return -1;
    }



    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        addAtIndex(q, 2,60);
        display(q);
        peekAtIndex(q, 3);
        display(q);
        remove(q, 2);
        display(q);
        
    }
    
}
