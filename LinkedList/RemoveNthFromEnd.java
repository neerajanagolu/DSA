package LinkedList;
class Node1 {
    int data;
    Node1 next;
    Node1(int d) { data = d; }
}


public class RemoveNthFromEnd {

    static Node1 removeNth(Node1 head, int n) {
        Node1 dummy = new Node1(0);
        dummy.next = head;

        Node1 fast = dummy, slow = dummy;
        for (int i = 0; i <= n; i++)
            fast = fast.next;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    static void print(Node1 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);

        head = removeNth(head, 2);
        print(head);
    }
}
