package Stacks;

import java.util.Stack;

public class BasicsSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Arushi");
        st.push("Sharma");
        st.push("books");
        st.push("Library");
        st.push("Lab");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.isEmpty());
        while(st.size()>0){
            System.out.println(st.pop());
        }
    }
}
