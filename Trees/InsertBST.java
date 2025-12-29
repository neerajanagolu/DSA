package Trees;
class InsertBST {

    static class Node {
        int data;
        Node left, right;
        Node(int d) {
            data = d;
        }
    }

    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        for (int x : arr)
            root = insert(root, x);

        inorder(root);
    }
}
