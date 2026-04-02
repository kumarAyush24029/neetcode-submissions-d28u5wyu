

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            // sum+=carry;

            carry = sum/10;
            int digit = sum%10;
            curr.next = new ListNode(digit);
            curr = curr.next;

        }
        return result.next;

        
    }
}