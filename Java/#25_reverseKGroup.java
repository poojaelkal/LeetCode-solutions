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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pt= head;
        int count=0;
        while(count<k && pt!=null){
            pt=pt.next;
            count++;
        }
        if(count==k){
            ListNode tmpCurr = head;
            ListNode reverseHead = reverseList(head,k);
            ListNode nextReverseHead = reverseKGroup(pt,k);
            tmpCurr.next = nextReverseHead;
            return reverseHead;
        }
        return head;
    }
    
    public ListNode reverseList(ListNode head, int k){
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextNode = head.next;
        
        while(k>0&&curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            if(nextNode!=null){
            nextNode=nextNode.next;}
            k--;
            
        }
        return prev;
    }
}
