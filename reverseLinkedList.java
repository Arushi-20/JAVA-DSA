package LinkedLists;

public class reverseLinkedList {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current  = head;
        while(current!=null){
            ListNode nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
}
