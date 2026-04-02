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
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return false;
        ListNode curr =head;
        ListNode next = head.next;
        while(curr!=null && next !=null){
            if(curr.val==next.val){
                return true;
            }
            if(curr.next==null) return false;
            if(next.next==null) return false;
            curr=curr.next;
            next=next.next.next;
        }
        return false;
        
    }
}
