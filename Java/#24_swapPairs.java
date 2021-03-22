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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode z=dummy;
        ListNode b=head;
        ListNode f=head.next;
        ListNode tHead=head.next;
        while(b!=null && f!=null){
            b.next=f.next;
            f.next=b;
            z.next=f;
            if(b!=null){
                z=b;
                b=b.next;
                if(b!=null){
                    f=b.next;
                }
            }
        }
        return tHead;
    }
}
