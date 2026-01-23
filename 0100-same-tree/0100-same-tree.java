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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode cur1 = p;
        TreeNode cur2 = q;
        if(cur1==null && cur2==null)return true;
        if(cur1==null || cur2==null)return false;
        return (cur1.val==cur2.val)&&isSameTree(cur1.left,cur2.left)&&isSameTree(cur1.right,cur2.right);
    }
}