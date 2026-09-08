// package Stacks;

import java.util.*;

public class TraverseTheStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(80);
        st.push(30);
        st.push(2);
        st.push(40);
        Stack<Integer> st2= new Stack<>();
        while(st.size()>0){
            int top = st.pop();
            st2.push(top);
        }
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st2);
    }
}
