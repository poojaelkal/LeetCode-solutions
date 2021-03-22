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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> res=new ArrayList<String>();
        if(root!=null) paths(root,res,"");
        return res;
    }
    public void paths(TreeNode root, List<String> res, String s){
         if(root.left==null && root.right==null) {
             res.add(s+root.val);
         }
        if(root.left!=null){
            paths(root.left,res,s+root.val+"->");
        }if(root.right!=null){
            paths(root.right,res,s+root.val+"->");
        }
    }
}
