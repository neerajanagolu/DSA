package LinkedList;
class Node5 {
    int data;
    Node5 next;
    Node5(int d) { data = d; }
}

public class MergeSortedLL {

    static Node5 merge(Node5 a, Node5 b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    static void print(Node5 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node5 a = new Node5(1);
        a.next = new Node5(3);
        Node5 b = new Node5(2);
        b.next = new Node5(4);

        print(merge(a, b));
    }
}
