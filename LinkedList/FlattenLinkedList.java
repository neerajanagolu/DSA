package LinkedList;
class Node11 {
    int data;
    Node11 next, bottom;
    Node11(int d) { data = d; }
}

public class FlattenLinkedList {

    static Node11 merge(Node11 a, Node11 b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data) {
            a.bottom = merge(a.bottom, b);
            return a;
        } else {
            b.bottom = merge(a, b.bottom);
            return b;
        }
    }

    static Node11 flatten(Node11 root) {
        if (root == null || root.next == null)
            return root;

        root.next = flatten(root.next);
        return merge(root, root.next);
    }

    public static void main(String[] args) {
        System.out.println("Flatten LL logic implemented");
    }
}
