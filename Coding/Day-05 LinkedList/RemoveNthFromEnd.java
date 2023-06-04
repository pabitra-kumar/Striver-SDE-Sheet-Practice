public class RemoveNthFromEnd {
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode i = head;
        ListNode j = head;
        while(j != null )
        {
            j = j.next;

            if(n<0)
            {
                i = i.next;
            }
            else
            n--;

        }
        if(n==0) return head.next;

        i.next = i.next.next;
        return head;
    }
}
