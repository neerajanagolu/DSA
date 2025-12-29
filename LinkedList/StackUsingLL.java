package LinkedList;
class Node4 {
    int data;
    Node4 next;
    Node4(int d) { data = d; }
}

class StackLL {
    Node4 top;

    void push(int x) {
        Node4 n = new Node4(x);
        n.next = top;
        top = n;
    }

    int pop() {
        if (top == null) return -1;
        int val = top.data;
        top = top.next;
        return val;
    }
}

public class StackUsingLL {
    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
