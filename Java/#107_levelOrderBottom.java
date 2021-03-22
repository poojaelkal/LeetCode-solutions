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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        LinkedList<TreeNode> que=new LinkedList<TreeNode>();
        Stack<List<Integer>> stack=new Stack<List<Integer>>();
        que.add(root);
        while(que.size()>0){
             int s=que.size();
            List<Integer> temp=new ArrayList<Integer>();
            while(s>0){
               TreeNode p=que.poll();
                if(p.left!=null) que.add(p.left);
                if(p.right!=null) que.add(p.right);
                temp.add(p.val);
                s--;
            }
            stack.push(temp);
        }
        while(!stack.isEmpty()){
           res.add(stack.pop());}
        return res;
        
    }
}
