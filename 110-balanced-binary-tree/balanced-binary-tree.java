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
    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

            int left = count(root.left);
            int right = count(root.right);

            if(Math.abs(right - left) > 1)return false;

            return isBalanced(root.left) && isBalanced(root.right);
        }
        public int count(TreeNode root){
            if(root == null) return 0;

            int lh = count(root.left);
            int rh = count(root.right);

            return 1 + Math.max(lh,rh);
    }
}