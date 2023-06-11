public class PalindromeCheck {
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head ;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverseList(slow.next);
        slow = slow.next;

        while(slow != null)
        {
            if(head.val != slow.val)
            return false;

            head= head.next;
            slow = slow.next;
        }

        return true;

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
