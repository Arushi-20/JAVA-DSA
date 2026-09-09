import java.io.EOFException;

class Node{
    int data;
    Node next;
    public int val;
    Node(int val){
        this.data = val;
    }
}

class MyStack{
    Node head;
    int len;

    int peek() throws Exception{
        if(head == null){
            throw new Exception("Stack is underflow Error");
        }
        return head.data;
    }

    int pop() throws Exception{
        if(head == null){
            throw new Exception("Stack is underflow Error");
        }
        //save the value of head
        int x = head.data;
        head = head.next;
        len--;
        return x;
    }

    void push(int ele){
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }

    int size(){
        return len;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
}

public class LLImplementationOfStack {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
        // st.pop(); this will give an error because stack is empty in starting 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        st.pop();
        st.display();
    }
}
