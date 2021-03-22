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
    int in=0;
    int pre=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,Integer.MIN_VALUE);
    }
    
    public TreeNode build(int[] preorder, int[] inorder, int stop)
    {
        if(pre>=preorder.length) return null;
        if(inorder[in]==stop){
            in++;
            return null;
        }
        TreeNode node = new TreeNode(preorder[pre++]);
        node.left=build(preorder,inorder,node.val);
        node.right=build(preorder,inorder,stop);
        return node;
    }
}
