package Trees;
class PriorityQueueBST {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    static int extractMin(Node root) {
        Node parent = null;
        while (root.left != null) {
            parent = root;
            root = root.left;
        }
        if (parent != null)
            parent.left = root.right;

        return root.data;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 40);
        root = insert(root, 10);
        root = insert(root, 30);
        root = insert(root, 20);

        System.out.println("Min Priority Element: " + extractMin(root));
    }
}
