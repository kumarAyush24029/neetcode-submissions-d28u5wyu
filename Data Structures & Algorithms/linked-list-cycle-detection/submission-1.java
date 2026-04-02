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
        ListNode front = head.next;
        while(curr!=null && front !=null){
            if(curr.val==front.val){
                return true;
            }
            if(curr.next==null) return false;
            if(front.next==null) return false;
            curr=curr.next;
            front=front.next.next;
        }
        return false;
        
    }
}
