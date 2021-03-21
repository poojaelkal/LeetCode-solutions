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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null){
            return ans;
        }
        LinkedList<TreeNode> que=new LinkedList<TreeNode>();
        que.add(root);
        while(que.size()!=0){
            int s = que.size();
            List<Integer> temp = new ArrayList<Integer>();
            while(s>0){
                TreeNode p = que.poll();
                temp.add(p.val);
                if(p.left!=null) que.add(p.left);
                if(p.right!=null) que.add(p.right);
                s--;
            }
            ans.add(temp);
        }
        return ans;
    }
}
