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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2!=null) return list2;
        if(list2==null && list1!=null) return list1;
        if(list1==null && list2== null ) return list1;


        ListNode curra = list1;
        ListNode currb = list2;
        ListNode head= null;
        ListNode stand = null;
        if(curra.val<=currb.val){
            stand = curra;
            head=curra;
            curra=curra.next;
        }
        else{
            stand = currb;
            head=currb;
            currb=currb.next;
        }
        while(curra!=null && currb!=null){
            if(curra.val<=currb.val){
                stand.next = curra;
                stand=curra;
                curra=curra.next;
        } 
            else{
                stand.next = currb;
                stand=currb;
                currb=currb.next;
                }


        }
        if(curra==null && currb!=null){
            stand.next=currb;
        }
        if(currb==null && curra!=null){
            stand.next=curra;

        }
        return head;

        
    }
}