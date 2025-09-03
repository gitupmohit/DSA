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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = preorder.length;
        for(int i=0; i<n; i++){
            map.put(inorder[i] , i);
        }
        TreeNode root = build(preorder, 0, n-1, inorder, 0, n-1, map);
        return root;
    }

    public TreeNode build(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend,
        HashMap<Integer, Integer> map) {
        if(prestart > preend || instart > inend) return null;

        TreeNode root = new TreeNode(preorder[prestart]);
        int index = map.get(root.val);
        int left = index - instart;

        root.left = build(preorder , prestart + 1, prestart + left, inorder , instart, index - 1, map);
        root.right = build(preorder , prestart + left + 1, preend, inorder , index + 1 , inend, map);

        return root;
    }
}