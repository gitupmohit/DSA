/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if(root == null || root == p || root == q){
        //     return root;
        // }

        // TreeNode left = lowestCommonAncestor(root.left,p,q);
        // TreeNode right = lowestCommonAncestor(root.right,p,q);

        // if(left == null){
        //     return right;
        // }
        // else if(right == null){
        //     return left;
        // }
        // else{
        //     return root;
        // }

        ArrayList<TreeNode> pl = new ArrayList<>();
        ArrayList<TreeNode> ql = new ArrayList<>();
        
        path(pl, root, p);
        path(ql, root, q);

        int i = 0;
        // Compare paths until they diverge
        while (i < pl.size() && i < ql.size() && pl.get(i) == ql.get(i)) {
            i++;
        }
        return pl.get(i - 1); // Last common node
    }

    public boolean path(ArrayList<TreeNode> list, TreeNode root, TreeNode x) {
        if (root == null) return false;

        list.add(root);
        if (root == x) return true;

        if (path(list, root.left, x) || path(list, root.right, x)) {
            return true;
        }

        list.remove(list.size() - 1); // Backtrack
        return false;

    }
}