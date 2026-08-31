package LinkedLists;

//singly linked list
class Node{
    //instance variable
    int data;
    Node next;
    //class parameterized constructor
    Node(int data){
        this.data = data;  //hold the current calling object reference
    }
}

//generic 
// class Node<T>{
//     T data;
//     Node<T> next;
// }


public class DesignLinkedList {

    Node start; //default value is null
    int size;

    public void addAtHead(int val){
        //create a new node
        Node node =  new Node(val);
        size++;
        //if linked list is empty
        if(start == null){
            start = node;
        }
        else{
            node.next = start;
            start = node;
        }
    }


    public void addAtTail(int val){
        Node node = new Node(val);
        size++;
        //if node is empty
        if(start == null){
            start = node;
        }
        else{
            //dummy pointer
            Node temp = start;
            while(temp.next!=null){
                //move to the next next nodes
                temp=temp.next;
            }
            temp.next = node;
        }
    }


    public void addAtIndex(int index, int val){
        if(index<0 || index>size){
            return;
        }
        Node node = new Node(val);
        size++;
        if(start == null){
            start = node; 
            return;
        }
        //add at head node if index is 0
        if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            //add in middle
            Node temp =start;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }


    public void deleteAtIndex(int index){
        if(index<0 || index>=size){
            return;
        }
        if(start == null){
            return;
        }
        if(index == 0){
            start = start.next;
        }
        else{
            Node temp = start;
            for(int i=0;i<index-1;i++){
               temp=temp.next;
        }
            temp.next = temp.next.next;
        }
        size--;
    }


    public int get(int index){
        if(index<0 || index>size){
            return -1;
        }
        Node temp = start;
        for(int i=0; i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
}
