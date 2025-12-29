package Trees;
import java.util.*;

class UpdateBST {

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

    static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            Node temp = root.right;
            while (temp.left != null)
                temp = temp.left;
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

        int[] arr = {50, 30, 70, 20, 40};
        for (int x : arr)
            root = insert(root, x);

        System.out.println("Enter old value and new value:");
        int oldVal = sc.nextInt();
        int newVal = sc.nextInt();

        root = delete(root, oldVal);
        root = insert(root, newVal);

        inorder(root);
    }
}
