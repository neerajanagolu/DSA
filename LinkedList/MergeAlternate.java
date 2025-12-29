package LinkedList;
class Node2 {
    int data;
    Node2 next;
    Node2(int d) { data = d; }
}

public class MergeAlternate {

    static Node2 merge(Node2 h1, Node2 h2) {
        Node2 curr = h1;
        while (curr != null && h2 != null) {
            Node2 temp = h2;
            h2 = h2.next;

            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }
        return h1;
    }

    static void print(Node2 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node2 h1 = new Node2(1);
        h1.next = new Node2(3);
        h1.next.next = new Node2(5);

        Node2 h2 = new Node2(2);
        h2.next = new Node2(4);
        h2.next.next = new Node2(6);

        print(merge(h1, h2));
    }
}
