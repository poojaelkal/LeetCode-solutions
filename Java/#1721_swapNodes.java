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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode first=head;
        ListNode last=head;
        for(int i=0;i<k;i++){
            if(first!=null) first=first.next;
        }
        while(first!=null){
            last=last.next;
            first=first.next;
        }
        first=head;
        for(int i=0;i<k-1;i++){
            first=first.next;
        }
        int temp=first.val;
        first.val=last.val;
        last.val=temp;
        
        return head;
        
    }
}
