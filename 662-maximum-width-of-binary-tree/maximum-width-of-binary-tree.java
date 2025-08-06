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
    class pair{
        TreeNode root;
        int num;

        pair(TreeNode root , int num){
            this.root = root;
            this.num = num;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int ans = 0;
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(root, 0));

        while(!q.isEmpty()){
            int minn = q.peek().num;
            int size = q.size();
            int first = 0;
            int last = 0;

            for(int i=0; i<size; i++){
                int currnum = q.peek().num;
                TreeNode node = q.peek().root;
                q.poll();
                if(i == 0) first = currnum - minn;
                if(i == size -1) last = currnum - minn;

                if(node.left != null) q.offer(new pair(node.left , currnum *2 +1));
                if(node.right != null) q.offer(new pair(node.right , currnum *2 +2));
            }
            ans = Math.max(ans , last - first + 1);
        }
        return ans;
    }
}