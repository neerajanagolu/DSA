package Trees;
import java.util.*;

class AVLTree {

    static class Node {
        int data, height;
        Node left, right;
        Node(int d) {
            data = d;
            height = 1;
        }
    }

    static int height(Node n) {
        return n == null ? 0 : n.height;
    }

    static int getBalance(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    static Node rightRotate(Node y) {
        Node x = y.left;
        Node t = x.right;

        x.right = y;
        y.left = t;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    static Node leftRotate(Node x) {
        Node y = x.right;
        Node t = y.left;

        y.left = x;
        x.right = t;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        if (balance > 1 && key < root.left.data)
            return rightRotate(root);

        if (balance < -1 && key > root.right.data)
            return leftRotate(root);

        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
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

        inorder(root);
    }
}
