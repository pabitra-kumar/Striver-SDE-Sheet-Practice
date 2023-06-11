
public class InterSectionPoint {
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

    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        // HashMap<ListNode , Integer > m = new HashMap<>();
        // while(h1 != null)
        // {
        // m.put(h1 , 1);
        // h1 = h1.next;
        // }
        // while(h2 != null)
        // {
        // if(m.containsKey(h2))
        // return h2;

        // h2 = h2.next ;
        // }

        // return h1;

        ListNode d1 = h1;
        ListNode d2 = h2;

        int i = 0;
        while (d1 != d2 && d1 != null && d2 != null) {
            d1 = d1.next;
            d2 = d2.next;

            if (d1 == null && i++ <= 2)
                d1 = h2;

            if (d2 == null && i++ <= 2)
                d2 = h1;
        }

        return d1 == d2 ? d1 : null;
    }
}
