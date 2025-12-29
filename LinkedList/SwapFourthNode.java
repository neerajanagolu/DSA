package LinkedList;
class Node7 {
    int data;
    Node7 next;
    Node7(int d) { data = d; }
}

public class SwapFourthNode {

    static Node7 swap(Node7 head) {
        Node7 a = head, b = head;
        for (int i = 1; i < 4; i++) a = a.next;

        Node7 temp = a;
        while (temp.next != null) {
            temp = temp.next;
            b = b.next;
        }

        int t = a.data;
        a.data = b.data;
        b.data = t;
        return head;
    }

    static void print(Node7 h) {
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node7 head = new Node7(1);
        for (int i = 2; i <= 8; i++) {
            Node7 t = head;
            while (t.next != null) t = t.next;
            t.next = new Node7(i);
        }
        print(swap(head));
    }
}
