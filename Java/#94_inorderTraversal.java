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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        if(root==null){
            return res;
        }
        TreeNode curr=root;
        while(curr!=null || !s1.isEmpty()){
            while(curr!=null){
                s1.push(curr);
                curr=curr.left;
            }
            TreeNode r=s1.pop();
            res.add(r.val);
            curr=r.right;
            
        }
        return res;
        
    }
}
