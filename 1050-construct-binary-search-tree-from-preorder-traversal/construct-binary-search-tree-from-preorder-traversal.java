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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int[] in = Arrays.copyOf(preorder, preorder.length);
        Arrays.sort(in);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(in[i],i);
        }
        TreeNode root = build(preorder , 0, n-1, in, 0, n-1, map);
        return root;
    }

    public TreeNode build(int[] preorder , int ps, int pe , int[] in, int is, int ie, HashMap<Integer, Integer> map){
        if(ps > pe || is > ie) return null;
        TreeNode root = new TreeNode(preorder[ps]);

        int index = map.get(root.val);
        int left = index - is;

       root.left = build(preorder, ps + 1, left + ps, in, is, index-1,map);
       root.right = build(preorder, ps + 1 + left,pe , in, index+1, ie,map);
        return root;
    }
}