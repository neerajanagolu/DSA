package Trees;
import java.util.*;

class DeleteBST {

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

    static Node minValue(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // one or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // two children
            Node temp = minValue(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
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
        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++)
            root = insert(root, sc.nextInt());

        System.out.println("Enter value to delete:");
        int key = sc.nextInt();
        root = delete(root, key);

        System.out.println("Inorder after deletion:");
        inorder(root);
    }
}
