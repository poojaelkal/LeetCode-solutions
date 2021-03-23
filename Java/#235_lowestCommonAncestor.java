/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root==null || root==p || root==q){
           return root;
       } 
        TreeNode lef = lowestCommonAncestor(root.left,p,q);
        TreeNode rig=lowestCommonAncestor(root.right,p,q);
        return rig==null?lef:lef==null?rig:root;
    }
}
