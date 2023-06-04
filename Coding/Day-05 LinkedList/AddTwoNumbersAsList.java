public class AddTwoNumbersAsList {
    /* 
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/
public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode temp = new ListNode();
    ListNode head = temp;
    int i = 0;
    while(l1 != null || l2 != null || i != 0)
    {
        int l = l1==null ? 0 : l1.val ;
        int m = l2==null ? 0 : l2.val ;
        int s = l + m + i;
        i = s/10;

        temp.val = s%10;
        
        l1 = l1==null ? l1 : l1.next;
        l2 = l2==null ? l2 : l2.next;

        if(l1 != null || l2 != null || i != 0)
        temp.next = new ListNode();
        
        temp = temp.next;
    }
    temp = null;
    return head;
}
}
