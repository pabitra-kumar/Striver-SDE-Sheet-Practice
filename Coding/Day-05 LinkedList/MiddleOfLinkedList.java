

public class MiddleOfLinkedList {
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode h1 = head;
        int i = 1;
        while(h1.next != null)
        {
            h1 = h1.next;
            i++;
        }
        i = i/2 + 1;
        h1 = head;
        while(i-->1)
        {
            h1 = h1.next;
        }
        return h1;
    }
}
