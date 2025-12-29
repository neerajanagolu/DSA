package Trees;
import java.util.*;

class RedBlackTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> rbTree = new TreeSet<>();

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++)
            rbTree.add(sc.nextInt());

        System.out.println("Red Black Tree (Inorder):");
        for (int x : rbTree)
            System.out.print(x + " ");
    }
}
