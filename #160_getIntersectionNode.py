# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        if headA is None or headB is None:
            return None
        Pa = headA
        Pb = headB
        
        while Pa is not Pb:
            Pa = headB if Pa is None else Pa.next
            Pb = headA if Pb is None else Pb.next
        
        return Pa
