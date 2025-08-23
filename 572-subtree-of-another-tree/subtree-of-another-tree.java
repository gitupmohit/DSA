class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        
        // if current node matches and both trees are identical
        if (isSame(root, subRoot)) return true;
        
        // otherwise, keep searching in left and right subtrees
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        
        return a.val == b.val 
            && isSame(a.left, b.left) 
            && isSame(a.right, b.right);
    }
}
