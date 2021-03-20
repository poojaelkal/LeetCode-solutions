/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null){
            return head;
        }
       
        
        ListNode left=null;
        ListNode right=null;
        ListNode leftTail=null;
        ListNode rightTail=null;
        while(head!=null){
            if(head.val<x){
                if(left==null){
                    left = head;
                    leftTail=left;
                }else{
                    leftTail.next=head;
                    leftTail=leftTail.next;
                }
            }else{
                if(right==null){
                    right=head;
                    rightTail=right;
                }else{
                    rightTail.next=head;
                    rightTail=rightTail.next;
                }
            }
            
            head=head.next;
        }
        
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        rightTail.next=null;
        leftTail.next=right;
        return left;
        
    }
}
