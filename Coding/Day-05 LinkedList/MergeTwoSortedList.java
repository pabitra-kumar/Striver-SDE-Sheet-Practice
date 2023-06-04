public class MergeTwoSortedList {
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode merg(ListNode l1, ListNode l2)
    {
        ListNode temp = new ListNode();
        if(l1==null && l2==null)
        {
            return null;
        }
        if(l1 == null)
        {
            temp.val = l2.val;
            temp.next = l2.next;
            return temp;
        }
        if(l2 == null)
        {
            temp.val = l1.val;
            temp.next = l1.next;
            return temp;
        }
        if(l1.val >= l2.val)
        {
            temp.val = l2.val;
            temp.next = merg(l1,l2.next);
            return temp;
        }
        else
        {
          temp.val = l1.val;
            temp.next = merg(l1.next,l2);
            return temp;
        }
    }
}