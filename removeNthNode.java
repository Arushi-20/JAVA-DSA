package LinkedLists;

public class removeNthNode {
    public ListNode removeNthNodeFromEnd(ListNode head, int n){
        //step-1 count total number of nodes
        int count = 0;
        ListNode temp = head;
        if(head == null){
            return null;
        }
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        //step-2 compute where i need to reach 
        int reach = count - n;
        if(reach == 0){
            return head.next;
        }
        temp =head;
        for(int i=1;i<=reach-1;i++){
            temp = temp.next; //traversing
        }
        temp.next = temp.next.next;
        return head;
    }    
}
