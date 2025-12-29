package LinkedList;
class Node8 {
    int data;
    Node8 next;
    Node8(int d) { data = d; }
}

public class LLFrom2DMatrix {

    static Node8 convert(int[][] mat) {
        Node8 dummy = new Node8(0);
        Node8 curr = dummy;

        for (int[] row : mat)
            for (int x : row) {
                curr.next = new Node8(x);
                curr = curr.next;
            }
        return dummy.next;
    }

    static void print(Node8 h) {
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        print(convert(mat));
    }
}
