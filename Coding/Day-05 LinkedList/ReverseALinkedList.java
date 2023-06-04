
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseALinkedList {
    ListNode head ;
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
  
    public static void main(String[] args) {
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode h1 = null;
        while(head.next != null)
        {
            ListNode h2 = head;
            head = head.next;
            h2.next = h1;
            h1 = h2;
        }
        head.next = h1;
        return head;
        
    }
}


