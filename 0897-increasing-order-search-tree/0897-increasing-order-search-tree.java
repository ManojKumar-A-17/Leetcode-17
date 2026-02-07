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
    public void pre(List<Integer> l,TreeNode root){
        if(root != null){
            l.add(root.val);
            pre(l,root.left);
            pre(l,root.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        pre(l,root);
        Collections.sort(l);
        TreeNode res = new TreeNode(l.get(0));
        // res.right=null;
        TreeNode cur = res;
        for(int i=1;i<l.size();i++){
            res.right = new TreeNode(l.get(i));
            res=res.right;
        }
        return cur;
    }
}