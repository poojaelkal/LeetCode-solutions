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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
       Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode p=s.pop();
                TreeNode tr=p.left;
                p.left=p.right;
                p.right=tr;
                
            
            if(p.left!=null){
               
                s.push(p.left);
            } if(p.right!=null){
                
                s.push(p.right);
            }
            
        }
        return root;
    }
}
