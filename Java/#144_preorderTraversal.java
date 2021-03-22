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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res=new ArrayList<Integer>();
        if(root==null) return res;
        Stack<TreeNode> s=new Stack<TreeNode>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode p=s.pop();
            res.add(p.val);
            if(p.right!=null){
                s.push(p.right);
            }
            if(p.left!=null){
                s.push(p.left);
            }
        }
        return res;
    }
}
