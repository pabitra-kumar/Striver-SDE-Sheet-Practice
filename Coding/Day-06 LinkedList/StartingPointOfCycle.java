

public class StartingPointOfCycle {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        do{
            if(fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }while(slow != fast);

        slow = head ;

        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}