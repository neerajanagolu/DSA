package Trees;
class KthSmallestBST {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static int count = 0;

    static int kthSmallest(Node root, int k) {
        if (root == null) return -1;

        int left = kthSmallest(root.left, k);
        if (left != -1) return left;

        count++;
        if (count == k)
            return root.data;

        return kthSmallest(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);

        int k = 3;
        System.out.println("Kth Smallest: " + kthSmallest(root, k));
    }
}
