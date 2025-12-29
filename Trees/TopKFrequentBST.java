package Trees;
import java.util.*;

class TopKFrequentBST {

    static class Node {
        int freq;
        int value;
        Node left, right;

        Node(int freq, int value) {
            this.freq = freq;
            this.value = value;
        }
    }

    static Node insert(Node root, int freq, int value) {
        if (root == null)
            return new Node(freq, value);

        if (freq < root.freq)
            root.left = insert(root.left, freq, value);
        else
            root.right = insert(root.right, freq, value);

        return root;
    }

    static void reverseInorder(Node root, int k, List<Integer> res) {
        if (root == null || res.size() >= k) return;

        reverseInorder(root.right, k, res);
        if (res.size() < k)
            res.add(root.value);
        reverseInorder(root.left, k, res);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,3};

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        Node root = null;
        for (int key : map.keySet())
            root = insert(root, map.get(key), key);

        int k = 2;
        List<Integer> res = new ArrayList<>();
        reverseInorder(root, k, res);

        System.out.println("Top K Frequent Elements: " + res);
    }
}
