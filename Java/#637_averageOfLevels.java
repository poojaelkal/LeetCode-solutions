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
    public List<Double> averageOfLevels(TreeNode root) {
       
        List<Double> ans = new ArrayList<Double>();
        LinkedList<TreeNode> que=new LinkedList<TreeNode>();
         if(root==null) return ans;
        que.add(root);
        while(que.size()!=0){
            int s = que.size();
            int num=s;
            Double d=0.0;
            while(s!=0){
                TreeNode t = que.poll();
                if(t.left!=null) que.add(t.left);
                if(t.right!=null) que.add(t.right);
                d+=t.val;
                s--;
            }
            d = d/num;
            ans.add(d);
        }
        return ans;
    }
}
