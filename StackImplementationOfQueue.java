package Queues;

import java.util.*;

public class StackImplementationOfQueue {
    class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {
       
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(st1.size()>1){
            st2.push(st1.pop());
        }
        int front = st1.pop();
        while(st2.size()>0){
            st1.push(st2.pop());
        }
        return front;
    }

    public int peek() {
        while(st1.size()>1){
            st2.push(st1.pop());
        }
        int peekElement = st1.peek();
        while(st2.size()>0){
            st1.push(st2.pop());
        }
        return peekElement;
    }
    
    public boolean empty() {
        return (st1.size()==0);
    }
}
}
