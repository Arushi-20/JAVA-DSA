package Stacks;
import java.util.*;
public class pushElementAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(30);
        st.push(20);
        st.push(10);
        System.out.println(st);
        int ele = 50;
        pushAtTheBottom(st,ele);
        System.out.println(st);
    }

    private static void pushAtTheBottom(Stack<Integer> st, int ele) {

        if(st.size()==0){
            st.push(ele);
            return;
        }

        int top = st.pop();
        pushAtTheBottom(st,ele);
        st.push(top);
    }
}
