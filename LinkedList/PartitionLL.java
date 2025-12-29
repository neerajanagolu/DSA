package LinkedList;
class Node9 {
    int data;
    Node9 next;
    Node9(int d) { data = d; }
}

public class PartitionLL {

    static Node9 partition(Node9 head, int x) {
        Node9 small = new Node9(0), big = new Node9(0);
        Node9 s = small, b = big;

        while (head != null) {
            if (head.data < x) {
                s.next = head;
                s = s.next;
            } else {
                b.next = head;
                b = b.next;
            }
            head = head.next;
        }
        b.next = null;
        s.next = big.next;
        return small.next;
    }

    static void print(Node9 h) {
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node9 head = new Node9(1);
        head.next = new Node9(4);
        head.next.next = new Node9(3);
        head.next.next.next = new Node9(2);

        print(partition(head, 3));
    }
}
