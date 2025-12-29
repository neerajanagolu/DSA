package LinkedList;
class Node10 {
    int data;
    Node10 next;
    Node10(int d) { data = d; }
}
public class RemoveLoop {

    static void removeLoop(Node10 head) {
        Node10 slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
                return;
            }
        }
    }

    public static void main(String[] args) {
        Node10 head = new Node10(1);
        head.next = new Node10(2);
        head.next.next = head; // loop

        removeLoop(head);
        System.out.println("Loop removed");
    }
}
