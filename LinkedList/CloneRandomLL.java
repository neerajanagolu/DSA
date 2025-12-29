package LinkedList;
import java.util.*;

class Node12 {
    int data;
    Node12 next, random;
    Node12(int d) { data = d; }
}

public class CloneRandomLL {

    static Node12 cloneLL(Node12 head) {
        Map<Node12, Node12> map = new HashMap<>();
        Node12 curr = head;

        while (curr != null) {
            map.put(curr, new Node12(curr.data));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        System.out.println("Clone with random pointer implemented");
    }
}
