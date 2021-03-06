# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        res = []
        self.rootcall(root,res)
        return res
    
    def rootcall(self,root,res):
        if root:
            self.rootcall(root.left,res)
            res.append(root.val)
            self.rootcall(root.right,res)
        return res
            
