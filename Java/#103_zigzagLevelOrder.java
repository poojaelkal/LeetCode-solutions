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
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root==null) return res;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(root);
        int level=1;
        while(!s1.isEmpty()){
            
            int size=s1.size();
            List<Integer> l1 = new ArrayList<Integer>();
            while(!s1.isEmpty()){
                TreeNode n = s1.pop();
                if(level%2==0){
                    if(n.right!=null){
                    s2.push(n.right);
                    }if(n.left!=null){
                    s2.push(n.left);}
                }else{
                    if(n.left!=null){
                    s2.push(n.left);}
                    if(n.right!=null){
                    s2.push(n.right);
                    }
                }
                l1.add(n.val);
            }
            level++;
            res.add(l1);
            Stack<TreeNode> temp=s2;
            s2=s1;
            s1=temp;
            
        }
        return res;
    }
}
