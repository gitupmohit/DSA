/**
 * Definition for a binary tree node.
 * public class TreeNode {
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
class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int maxSoFar) {
        if (node == null) return 0;

        int good = 0;
        if (node.val >= maxSoFar) {
            good = 1; // this node is good
        }

        // update max for children
        maxSoFar = Math.max(maxSoFar, node.val);

        return good + dfs(node.left, maxSoFar) + dfs(node.right, maxSoFar);
    }
}
