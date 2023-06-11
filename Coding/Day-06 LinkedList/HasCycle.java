
public class HasCycle {
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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        do{
            if(fast == null || fast.next == null) return false;
            slow = slow.next ;
            fast = fast.next.next ;
            
        }while(slow != fast);

        return true;
    }
}