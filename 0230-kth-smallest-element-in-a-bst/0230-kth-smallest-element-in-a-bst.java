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
    public void IOT(TreeNode cur,List<Integer> l){
        if(cur == null) return ;
        IOT(cur.left,l);
        l.add(cur.val);
        IOT(cur.right,l);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l = new ArrayList<>();
        IOT(root,l);
        Collections.sort(l);
        return l.get(k-1);
    }
}