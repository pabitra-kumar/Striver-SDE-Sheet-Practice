
public class FlatteningTheList {
    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }
    public Node flatten(Node root) {
        if ((root == null) || (root.next == null))
            return root;
        Node ptr1 = root;
        Node ptr2 = root;
        while (root.next != null) {

            // To sort the next pointers
            if (root.data > root.next.data) {
                Node temp = root.next;
                Node temp2 = root.next.next;
                root.next = temp2;
                temp.next = root;
                root = temp;
            }

            // for traversing in next pointer
            ptr1 = root;
            ptr2 = root.next;
            root.next = ptr2.next; 

            // Sort the bottom pointers of ptr1 & ptr2
            while (ptr1.bottom != null && ptr2 != null) {
                Node temp = new Node(0);
                if (ptr1.bottom.data > ptr2.data) {
                    temp = ptr1.bottom;
                    ptr1.bottom = ptr2;
                    ptr1 = ptr2;
                    ptr2 = temp;
                } else {
                    ptr1 = ptr1.bottom;
                }
            }

            if (ptr1.bottom == null)
                ptr1.bottom = ptr2;

        }
        return root;
    }
}
