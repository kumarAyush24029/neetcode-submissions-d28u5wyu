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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        
        ListNode curr = head;
        
        if(count==n){
            return head.next;
        }
        int stand =1;
        while(stand<count-n){
            curr = curr.next; 
            stand+=1;
        }
        curr.next = curr.next.next;
        return head;




    }
}
