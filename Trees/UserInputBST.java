package Trees;
import java.util.*;

class UserInputBST {

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
        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++)
            root = insert(root, sc.nextInt());

        System.out.println("Inorder traversal:");
        inorder(root);
    }
}
