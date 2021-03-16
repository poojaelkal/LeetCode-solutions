/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        int carry=0;
        ListNode end=null;
        
        while(l1!=null || l2!=null || carry!=0){
            int value=carry;
            if(l1!=null){
                value+=l1.val;
            }if(l2!=null){
                value+=l2.val;
            }
            carry = value>=10?1:0;
            int sum = value%10;
            if(res==null){
                res=new ListNode(sum);
                end=res;
            }else{
                ListNode newnode = new ListNode(sum);
                end.next=newnode;
                end=newnode;
            }
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
            
        }
        return res;
    }
}
