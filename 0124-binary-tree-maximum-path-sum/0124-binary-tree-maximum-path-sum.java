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
    static int maxsum;
    public int maxPath(TreeNode root){
        if(root == null) return 0;
        int l = Math.max(0,maxPath(root.left));
        int r = Math.max(0,maxPath(root.right));
        maxsum = Math.max(maxsum,root.val+l+r);
        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE;
        maxPath(root);
        return maxsum;
    }
}