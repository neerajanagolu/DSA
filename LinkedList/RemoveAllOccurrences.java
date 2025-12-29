package LinkedList;
class Node6 {
    int data;
    Node6 next;
    Node6(int d) { data = d; }
}

public class RemoveAllOccurrences {

    static Node6 removeAll(Node6 head, int key) {
        while (head != null && head.data == key)
            head = head.next;

        Node6 curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data == key)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }

    static void print(Node6 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node6 head = new Node6(2);
        head.next = new Node6(2);
        head.next.next = new Node6(3);

        print(removeAll(head, 2));
    }
}
