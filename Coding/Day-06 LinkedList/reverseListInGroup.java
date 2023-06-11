public class reverseListInGroup {
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
    // public ListNode reverseKGroup(ListNode head, int k) {
    //     if(k == 1 || head == null) return head ;

    //     ListNode dummy = new ListNode(0);

    //     ListNode curr = dummy , nex = dummy , pre = dummy ;

    //     dummy.next = head ;

    //     int count = 0;
    //     while(curr.next != null)
    //     {
    //         curr = curr.next;
    //         count++;
    //     }

    //     while(count >= k)
    //     {
    //         curr = pre.next ;
    //         nex = curr.next ;
    //         for(int i = 1 ; i < k ; i++)
    //         {
    //             curr.next = nex.next;
    //             nex.next = pre.next ;
    //             pre.next = nex;
    //             nex = curr.next;
    //         }
    //         pre = curr;
    //         count -= k ;
    //     }

    //     return dummy.next;
    // }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1) return head;
        ListNode ptr = head ;
        int count = 0;
        while(count < k && ptr != null)
        {
            ptr = ptr.next ;
            count++;
        }

        if(count == k)
        {
            ListNode reversedHead = reverseLinkedList(head , k);

            head.next = reverseKGroup(ptr , k);

            return reversedHead ;
        }
        return head;
    }

    public static ListNode reverseLinkedList(ListNode head , int k) {
        ListNode new_head = head;
        ListNode ptr = head.next ;

        while(k > 1) {
            ListNode next_node = ptr.next ;
            ptr.next = new_head ;
            new_head = ptr ;
            ptr = next_node;
            k--;
            
        }

        return new_head;
    }
}
