# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if root is None:
            return 0
        else:
            lDepth = self.maxDepth(root.left)
            rDepth = self.maxDepth(root.right)
            
            if lDepth>rDepth:
                return lDepth+1
            else:
                return rDepth+1
