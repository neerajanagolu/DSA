/*
public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import javax.swing.tree.TreeNode;

public class HouseRobber_3 {
    public int rob(TreeNode root) {

        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0}; // [rob, skip]
        }

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int rob = root.val + left[1] + right[1];
        int skip = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{rob, skip};
    }


}
