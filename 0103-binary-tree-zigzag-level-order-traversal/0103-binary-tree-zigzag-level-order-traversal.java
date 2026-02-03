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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root == null) return li;
        q.add(root);
        int o=0;
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> l = new ArrayList<>();    
            for(int i=0;i<s;i++){
                root=q.remove();
                l.add(root.val);
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            if(o%2 != 0) Collections.reverse(l);
            li.add(l);
            o++;
        }
        return li;
    }
}