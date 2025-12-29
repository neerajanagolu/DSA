package LinkedList;
class Node3 {
    int data;
    Node3 next;
    Node3(int d) { data = d; }
}

class QueueLL {
    Node3 front, rear;

    void enqueue(int x) {
        Node3 n = new Node3(x);
        if (rear == null) {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }

    int dequeue() {
        if (front == null) return -1;
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }
}

public class QueueUsingLL {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

