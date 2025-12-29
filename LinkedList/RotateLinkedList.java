package LinkedList;
class Node {
    int data;
    Node2 next;
    Node(int d) { data = d; }
}

public class RotateLinkedList {

    static Node2 rotate(Node2 head, int k) {
        if (head == null || k == 0) return head;

        Node2 curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        curr.next = head;
        k = k % len;

        for (int i = 0; i < len - k; i++)
            curr = curr.next;

        head = curr.next;
        curr.next = null;
        return head;
    }

    static void print(Node2 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node2 head = new Node2(1);
        head.next = new Node2(2);
        head.next.next = new Node2(3);
        head.next.next.next = new Node2(4);

        head = rotate(head, 2);
        print(head);
    }
}
