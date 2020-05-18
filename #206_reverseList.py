# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None or head.next == None:
            return head
        else:
            reversed_todo = head
            list_todo = head.next
            reversed_todo.next = None
            
            while list_todo != None:
                tmp = list_todo
                list_todo = list_todo.next
                tmp.next = reversed_todo
                reversed_todo = tmp
                
            return reversed_todo
